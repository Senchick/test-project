import io.jooby.AccessLogHandler
import io.jooby.CorsHandler
import io.jooby.json.JacksonModule
import io.jooby.runApp

fun main(args: Array<String>) = runApp(args) {
    install(JacksonModule())
    decorator(CorsHandler())
    decorator(AccessLogHandler())

    install(::App)
}