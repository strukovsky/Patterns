import org.junit.Assert
import org.junit.Test

class PrototypeTest {
    @Test
    fun run()
    {
        val arr = ArrayList<Shape>()
        val circle1 = Circle(100, 1, 1, "blue")
        val rect1 = Rectangle(200, 30, 2, 2, "red")
        arr.add(circle1)
        arr.add(rect1)

        Assert.assertEquals(arr[0]::class.java, arr[1]::class.java)
    }
}