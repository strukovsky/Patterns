import org.junit.Assert
import org.junit.Test

class ObserverTest {
    @Test
    fun run()
    {
        val manager = EventManager()
        val send = SendListener()
        val receive = ReceiveListener()
        manager.subscribe("send", send)
        manager.subscribe("receive", receive)
        manager.notifyListener("send")
        manager.notifyListener("receive")
    }

    @Test
    fun testUnsubscribe()
    {
        val manager = EventManager()
        val send = SendListener()
        val receive = ReceiveListener()
        val send2 = SendListener()
        val receive2 = object: Listener
        {
            override fun update() {
                println("Extraordinary listener")
            }

        }
        manager.subscribe("receive", receive)
        manager.subscribe("send", send)
        manager.unsubscribe("send", send)
        manager.subscribe("send", send2)
        manager.unsubscribe("receive", receive)
        manager.subscribe("receive", receive2)

        manager.notifyListener("send")
        manager.notifyListener("receive")

        Assert.assertEquals(2, manager.getCountOfSubscribers())

    }
}