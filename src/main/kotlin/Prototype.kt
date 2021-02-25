abstract class Shape(var x: Int = 0, var y: Int = 0, var color: String = "")
{
    abstract fun clone(): Shape

    constructor(source: Shape) : this() {
        x = source.x
        y = source.y
        color = source.color
    }
}

class Rectangle : Shape
{
    constructor(source: Rectangle): super(source as Shape){
        width = source.width
        height = source.height
    }
    constructor(width: Int, height: Int, x: Int, y: Int, color: String)
    {
        this.width = width
        this.height = height
        this.x = x
        this.y = y
        this.color = color
    }
    var width: Int = 0
    var height: Int = 0


    override fun clone(): Shape {
        return Rectangle(this)
    }

}

class Circle: Shape
{
    constructor(source: Circle): super(source as Shape)
    {

    }
    constructor(radius: Int, x: Int, y: Int, color: String)
    {
        this.radius = radius
        this.x = x
        this.y = y
        this.color = color
    }
    var radius: Int = 0

    override fun clone() = Circle(this)
}