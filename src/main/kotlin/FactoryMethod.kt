interface Transport
{
    fun deliver(): String
}

class Cargo(val name: String)
{

}

class Truck(private val cargo: Cargo): Transport
{
    override fun deliver(): String {
        println("by truck")
        return cargo.name
    }

}

class Ship(private val cargo: Cargo): Transport
{
    override fun deliver(): String {
        println("by ship")
        return cargo.name
    }

}