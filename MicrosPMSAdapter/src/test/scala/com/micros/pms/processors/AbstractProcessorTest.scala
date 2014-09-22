package com.micros.pms.processors

import com.cloudkey.pms.micros.ows.OWSTools
import com.google.inject.{Guice, Inject, Injector}
import com.micros.pms.MicrosPMSModule
import org.mockito.MockitoAnnotations
import org.scalatest.mock.MockitoSugar
import org.scalatest.{BeforeAndAfterAll, FunSpec, ShouldMatchers}

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
abstract class AbstractProcessorTest[MicrosRequest, MicrosResponse] extends FunSpec with BeforeAndAfterAll with MockitoSugar
    with ShouldMatchers {

  @Inject
  var owsTools: OWSTools = _

  override protected def beforeAll() {
    MockitoAnnotations.initMocks(this)
    AbstractProcessorTest.injector.injectMembers(this)
  }

  def nameOf[T](implicit m: Manifest[T]) = m.runtimeClass.getSimpleName
}

object AbstractProcessorTest {
  var injector: Injector = Guice.createInjector(new MicrosPMSModule)
}