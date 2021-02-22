import org.junit.Assert
import org.junit.Test


class FactoryMethodTest {
    @Test
    fun run()
    {
        val cargo = Cargo("IPhone")
        val ship = Ship(cargo)
        val truck = Truck(cargo)
        Assert.assertEquals(ship.deliver(), truck.deliver())
    }

}