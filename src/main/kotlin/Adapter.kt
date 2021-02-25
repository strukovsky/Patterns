import kotlin.math.sqrt

class RoundHole(val radius: Int)
{

}

open class RoundStick(val radius: Int, private val length: Int)
{
    fun calculateVolume() = 6.28 * radius * length

}

class SquareStick(val width: Int, val length: Int)
{

}

class SquareToRoundAdapter(private  val square: SquareStick) : RoundStick((square.width * sqrt(2.0) / 2).toInt(), square.length)
{
}