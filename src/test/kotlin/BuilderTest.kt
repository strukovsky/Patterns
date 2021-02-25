import org.junit.Assert
import org.junit.Test

class BuilderTest {
    @Test
    fun run()
    {
        val b = HouseBuilder()
        val roof = SlateRoof()
        b.buildRoof(roof)
        val walls = PaperWalls()
        b.buildWalls(walls)
        val result = b.get().describe()
        Assert.assertEquals(result, "Roof: class SlateRoof Walls: class PaperWalls")
    }
}