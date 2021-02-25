class EventManager
{
    private val listeners = HashMap<String, Listener>()

    fun subscribe(type: String, listener: Listener)
    {
        listeners[type] = listener
    }

    fun unsubscribe(type: String, listener: Listener)
    {
        listeners.remove(type, listener)
    }

    fun notifyListener(type: String)
    {
        for(listener in listeners.filter { entry -> entry.key == type })
        {
            listener.value.update()
        }
    }

    fun getCountOfSubscribers() = listeners.size
}

interface Listener {
    fun update()
}

class SendListener: Listener
{
    override fun update() {
        println("A letter was sent")
    }

}

class ReceiveListener: Listener
{
    override fun update() {
        println("Letter was received")
    }
}

