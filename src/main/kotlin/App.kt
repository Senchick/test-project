import io.jooby.Kooby

class App: Kooby ({
    get("/test") {
        Message("Ok!")
    }
})