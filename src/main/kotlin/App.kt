import io.jooby.Kooby

class App: Kooby ({
    get("/test") {
        Message("Ok2!")
    }
    get("/test2") {
        Message("Ok2!")
    }
})