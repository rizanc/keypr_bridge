import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy

appender("FILE", RollingFileAppender) {
    encoder(PatternLayoutEncoder) {
        Pattern = "%-5p [%d{\"HH:mm:ss.SSS'Z'\",UTC}] %c: %m\\n%ex"
        // %d{dd MMM yyyy HH:mm:ss,SSS} [%t] %p %c - %m%n"
    }
    rollingPolicy(TimeBasedRollingPolicy) {
        FileNamePattern = "logs/dataharvester-%d{yyyy-MM-dd}.log"
    }
}

root(INFO, ["FILE"])
