fun main(){
    val result = AbstractCircle(4.0)
    println(result.area())
    result.display()
}

abstract class AbstractShape(){
    var name: String = ""
    abstract fun area() : Double
    abstract fun display()
}
class AbstractCircle (val radius: Double):AbstractShape() {
    override fun area(): Double = Math.PI*radius*radius
    override fun display(){
        println("circle is getting display")
    }

}
