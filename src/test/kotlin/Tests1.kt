import io.jooby.MockRouter
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Tests1 {
    @Test
    fun test1() {
        assertEquals(2 + 3, 5)
    }

    @Test
    fun test2() {
        val mockRouter = MockRouter(App())
        assertEquals(
            Message("Ok!"),
            mockRouter.get("/test").value(Message::class.java)
        )
    }
}