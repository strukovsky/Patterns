import org.junit.Assert
import org.junit.Test

class BridgeTest {
    @Test
    fun run()
    {
        val radio = Radio()
        val tv = TV()
        val remote1 = Remote(radio)
        val remote2 = Remote(tv)
        remote1.togglePower()
        remote2.togglePower()
        remote2.increaseVolume()
        remote1.increaseVolume()
        remote2.decreaseVolume()
        remote1.decreaseVolume()
        Assert.assertEquals(remote1.getVolume(), remote2.getVolume())

    }
}