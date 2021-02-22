import org.junit.Assert
import org.junit.Test

class SingletonTest {
    @Test
    fun run()
    {
        val s1 = Singleton.getInstance()
        val s2 = Singleton.getInstance()
        Assert.assertEquals(s1, s2)
    }

}