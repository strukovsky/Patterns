
class Remote(private val device: Device)
{
    fun togglePower()
    {
        if (device.isEnabled())
            device.disable()
        else
            device.enable()
    }

    fun increaseVolume() =
        device.increaseVolume()


    fun decreaseVolume() = device.decreaseVolume()
    fun getVolume() = device.getVolume()
}

interface Device {
    fun isEnabled(): Boolean
    fun enable()
    fun disable()
    fun increaseVolume()
    fun decreaseVolume()
    fun getVolume(): Int

}

class Radio: Device
{
    var enabled = false
    private var volume = 50
    override fun getVolume() = volume
    override fun isEnabled() = enabled

    override fun enable() {
        enabled = true
    }

    override fun disable() {
        enabled = false
    }

    override fun increaseVolume() {
        if(volume < 100)
            volume += 5
    }

    override fun decreaseVolume() {
        if(volume > 0)
            volume -= 5
    }

}

class TV: Device
{   private var enabled = false
    private var volume = 50
    override fun getVolume() = volume
    override fun isEnabled() = enabled

    override fun enable() {
        enabled = true
    }

    override fun disable() {
        enabled = false
    }

    override fun increaseVolume() {
        volume += 10
    }

    override fun decreaseVolume() {
        volume -= 10
    }

}