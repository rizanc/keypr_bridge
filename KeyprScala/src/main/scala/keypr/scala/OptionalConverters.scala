package keypr.scala

import com.google.common.base.Optional

/**
 * @author Charlie La Mothe (charlie@keypr.com)
 */
object OptionalConverters {
  implicit def toOption[T](opt: Optional[T]): Option[T] = {
    Option(opt.orNull())
  }

  implicit def toOptional[T](opt: Option[T]): Optional[T] = {
    opt match {
      case Some(x) => Optional.of(x)
      case None => Optional.absent()
    }
  }
}
