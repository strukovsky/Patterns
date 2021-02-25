class House {
    var roof: Roof? = null
    var walls: Walls? = null

    fun describe() =
            "Roof: ${roof!!::class.java} Walls: ${walls!!::class.java}"

}

interface Walls {

}

class PaperWalls : Walls {

}

class BrickWalls : Walls {

}

interface Roof {

}

class TilesRoof : Roof {

}

class SlateRoof : Roof {

}

interface Builder {
    fun reset(): Builder
    fun buildWalls(walls: Walls): Builder
    fun buildRoof(roof: Roof): Builder
}


class HouseBuilder : Builder {
    private var result: House = House()
    override fun reset(): Builder {
        result = House()
        return this
    }

    override fun buildWalls(walls: Walls): Builder {
        result.walls = walls
        return this
    }

    override fun buildRoof(roof: Roof): Builder {
        result.roof = roof
        return this
    }

    fun get() = result

}

class HouseDesignBuilder : Builder {
    private var result: House = House()
    override fun reset(): Builder {
        result = House()
        return this
    }

    override fun buildWalls(walls: Walls): Builder {
        result.walls = walls
        return this
    }

    override fun buildRoof(roof: Roof): Builder {
        result.roof = roof
        return this
    }

}