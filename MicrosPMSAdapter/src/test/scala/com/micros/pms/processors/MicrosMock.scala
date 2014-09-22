package com.micros.pms.processors

import java.io.StringReader
import javax.xml.bind.{JAXBContext, Unmarshaller}
import javax.xml.ws.Holder

import com.cloudkey.pms.micros.og.core.OGHeader
import com.google.common.base.Strings
import com.google.inject.Inject
import com.google.inject.name.Named
import org.joda.time.DateTime
import org.mockito.BDDMockito._
import org.mockito.{ArgumentCaptor, Captor, MockitoAnnotations}
import org.scalatest.ShouldMatchers
import org.scalatest.mock.MockitoSugar

/**
 * Class for verifying [[OWSProcessor]] calls using a mocked OWS service.
 *
 * @author Charlie La Mothe (charlie@keypr.com)
 */
class MicrosMock[MicrosRequest <: AnyRef, MicrosResponse <: AnyRef, Request, Response]
  (serviceCall: (MicrosRequest, Holder[OGHeader]) => MicrosResponse, processorCall: (Request => Response))
  (implicit microsRequestManifest: Manifest[MicrosRequest], microsResponseManifest: Manifest[MicrosResponse])
    extends MockitoSugar with ShouldMatchers {

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

  @Captor
  var requestCaptor: ArgumentCaptor[MicrosRequest] = _

  @Captor
  var headerCaptor: ArgumentCaptor[Holder[OGHeader]] = _

  MockitoAnnotations.initMocks(this)

  AbstractProcessorTest.injector.injectMembers(this)

  def respondToRequestWith(request: Request, microsResponseXml: String) = {
    requestCaptor = ArgumentCaptor.forClass(microsRequestManifest.runtimeClass.asInstanceOf[Class[MicrosRequest]])
    headerCaptor = ArgumentCaptor.forClass(classOf[Holder[OGHeader]])

    given(serviceCall(requestCaptor.capture(), headerCaptor.capture()))
      .willReturn(xmlToObj(microsResponseXml))
  }

  def verify() = {
    verifyHeader(headerCaptor.getValue)
    getMicrosRequest should not be (null)
  }

  def getMicrosRequest = requestCaptor.getValue

  /**
   * Given a PMS request and the corresponding expected OPERA response xml,
   * calls the processor with the request, and verifies that the OPERA service is called.
   *
   * Returns the Micros request the processor created from the PMS request
   * and the PMS response the processor created from the OPERA response xml, for further verification.
   *
   * @param request
   * @param microsResponseXml
   * @return
   */
  def run(request: Request, microsResponseXml: String): MicrosMockResult[MicrosRequest, Response] = {
    respondToRequestWith(request, microsResponseXml)

    val response: Response = processorCall(request)
    verify()

    MicrosMockResult(getMicrosRequest, response)
  }

  /**
   * Verifies that the given request header is correct.
   *
   * @param header
   */
  protected def verifyHeader(header: Holder[OGHeader]) {
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

  /**
   * Converts a XML string to a POJO of the given JAXB type.
   *
   * @param xml
   * @tparam T
   * @return
   */
  protected def xmlToObj[T](xml: String): MicrosResponse = {
    val unmarshaller: Unmarshaller = JAXBContext.newInstance(microsResponseManifest.runtimeClass).createUnmarshaller()

    unmarshaller.unmarshal(new StringReader(xml)).asInstanceOf[MicrosResponse]
  }
}

case class MicrosMockResult[MicrosRequest, Response] (microsRequest: MicrosRequest, response: Response)