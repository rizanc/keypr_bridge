import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.rolling.RollingFileAppender
import ch.qos.logback.core.rolling.TimeBasedRollingPolicy

appender("FILE", RollingFileAppender) {
    encoder(PatternLayoutEncoder) {
        Pattern = "%-5p [%d{\"HH:mm:ss.SSS'Z'\",UTC}] %c: %m\\n%ex"
    }
    rollingPolicy(TimeBasedRollingPolicy) {
        FileNamePattern = "/var/log/uploadservice-%d{yyyy-MM-dd}.log"
    }
}

root(INFO, ["FILE"])