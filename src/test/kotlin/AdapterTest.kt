import org.junit.Assert
import org.junit.Test

class AdapterTest {
    @Test
    fun run()
    {
        val roundStick = RoundStick(3, 3)
        val squareStick = SquareStick(2, 3)
        val adapted = SquareToRoundAdapter(squareStick)
        val roundVolume  = roundStick.calculateVolume()
        val adaptedVolume  = adapted.calculateVolume()
        Assert.assertEquals(roundVolume, adaptedVolume, 0.1)
    }
}