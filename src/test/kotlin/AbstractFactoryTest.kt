import org.junit.Assert
import org.junit.Test

class AbstractFactoryTest {

    @Test
    fun run()
    {
        val warehouse = Warehouse()
        val first = warehouse.receiveChair("ArtDeco")
        first?.sit()
        val second = warehouse.receiveSofa("Modern")
        second?.lie()

        Assert.assertNotEquals(first!!::class.java, second!!::class.java)
    }
}