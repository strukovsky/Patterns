abstract class AbstractFactory {

}

interface Chair {
    fun hasLegs(): Boolean
    fun sit()
}

class VictorianChair : Chair {
    override fun hasLegs(): Boolean {
        return true
    }

    override fun sit() {
        println("Sit on victorian chair")
    }

}

class ArtDecoChair : Chair {
    override fun hasLegs(): Boolean {
        return true
    }

    override fun sit() {
        println("Sit on art decó")
    }

}

class ModernChair : Chair {
    override fun hasLegs(): Boolean {
        return true
    }

    override fun sit() {
        println("Sit on modern")
    }

}

interface Sofa {
    fun lie()
}

class VictorianSofa : Sofa {
    override fun lie() {
        println("Lie on victorian")
    }

}

class ArtDecoSofa : Sofa {
    override fun lie() {
        println("Lie on art deco")
    }

}

class ModernSofa : Sofa {
    override fun lie() {
        println("Lie on modern")
    }
}

interface FurnitureFactory {
    fun createChair(): Chair
    fun createSofa(): Sofa
}


class VictorianFactory() : FurnitureFactory {
    override fun createChair() = VictorianChair()
    override fun createSofa() = VictorianSofa()
}

class ArtDecoFactory() : FurnitureFactory {
    override fun createChair() = ArtDecoChair()
    override fun createSofa() = ArtDecoSofa()
}

class ModernFactory(): FurnitureFactory{
    override fun createChair() = ModernChair()
    override fun createSofa() = ModernSofa()
}


class Warehouse()
{
    private fun getFactoryByStyle(style: String) =
                when (style)
                {
                    "Modern" -> ModernFactory()
                    "ArtDeco" -> ArtDecoFactory()
                    "Victorian" -> VictorianFactory()
                    else -> null
                }


    fun receiveChair(style:String) : Chair?
    {
        return getFactoryByStyle(style)?.createChair()
    }

    fun receiveSofa(style: String): Sofa?
    {
        return getFactoryByStyle(style)?.createSofa()
    }



}