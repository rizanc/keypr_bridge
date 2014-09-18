package com.micros.pms.processors

import java.io.StringReader
import javax.xml.bind.{JAXBContext, Unmarshaller}
import javax.xml.ws.Holder

import com.cloudkey.pms.micros.og.core.OGHeader
import com.cloudkey.pms.micros.ows.OWSTools
import com.google.common.base.Strings
import com.google.inject.name.Named
import com.google.inject.{Guice, Inject, Injector}
import com.micros.pms.MicrosPMSModule
import org.joda.time.DateTime
import org.mockito.{ArgumentCaptor, Captor, MockitoAnnotations}
import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfterAll, FunSpec, ShouldMatchers}

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
abstract class AbstractProcessorTest[MicrosRequest, MicrosResponse](implicit microsResponseManifest: Manifest[MicrosResponse]) extends FunSpec with BeforeAndAfterAll with MockitoSugar
    with ShouldMatchers {

  var injector: Injector = _

  val unmarshaller: Unmarshaller = JAXBContext.newInstance(microsResponseManifest.runtimeClass).createUnmarshaller()

  @Captor
  var requestCaptor: ArgumentCaptor[MicrosRequest] = _

  @Captor
  var headerCaptor: ArgumentCaptor[Holder[OGHeader]] = _

  @Inject
  var owsTools: OWSTools = _

  @Inject
  @Named("keypr.bridge.micros.hotel.chainCode")
  protected var chainCode: String = _

  @Inject
  @Named("keypr.bridge.micros.hotel.hotelCode")
  protected var hotelCode: String = _

  @Inject(optional = true)
  @Named("keypr.bridge.micros.ows.auth.username")
  protected var authUsername: String = _

  @Inject(optional = true)
  @Named("keypr.bridge.micros.ows.auth.password")
  protected var authPassword: String = _

  @Inject
  @Named("keypr.bridge.micros.ows.origin.entityId")
  protected var entityId: String = _

  @Inject
  @Named("keypr.bridge.micros.ows.origin.systemType")
  protected var systemType: String = _

  @Inject
  @Named("keypr.bridge.micros.ows.destination.entityId")
  protected var destEntityId: String = _

  @Inject
  @Named("keypr.bridge.micros.ows.destination.systemType")
  protected var destSystemType: String = _

  override protected def beforeAll() {
    MockitoAnnotations.initMocks(this)

    injector = Guice.createInjector(new MicrosPMSModule)
    injector.injectMembers(this)
  }

  val responseXml: String

  def microsResponse: MicrosResponse = unmarshaller.unmarshal(new StringReader(responseXml)) match {
    case res: MicrosResponse => res
  }

  protected def verifyCapturedHeader() {
    headerCaptor.getValue.value should not be (null)
    val header = headerCaptor.getValue.value
    header.getTransactionID.size shouldBe 36 // Length of a UUID
    header.getOrigin.getEntityID shouldBe entityId
    header.getOrigin.getSystemType shouldBe systemType
    header.getOrigin.getOrganizationID shouldBe null
    header.getDestination.getEntityID shouldBe destEntityId
    header.getDestination.getSystemType shouldBe destSystemType
    header.getDestination.getOrganizationID shouldBe null

    header.getTimeStamp.minusMinutes(1).isBefore(new DateTime()) shouldBe true
    header.getTimeStamp.plusMinutes(1).isAfter(new DateTime()) shouldBe true

    header.getAuthentication.getUserCredentials.getUserName shouldBe authUsername
    header.getAuthentication.getUserCredentials.getUserPassword shouldBe authPassword

    header.getIntermediaries.isEmpty shouldBe true
    header.getOtherAttributes.isEmpty shouldBe true
    Strings.isNullOrEmpty(header.getTerminalID) shouldBe true
    Strings.isNullOrEmpty(header.getAuthToken) shouldBe true
    Strings.isNullOrEmpty(header.getPrimaryLangID) shouldBe true
  }

  def nameOf[T](implicit m: Manifest[T]) = m.runtimeClass.getSimpleName
}
