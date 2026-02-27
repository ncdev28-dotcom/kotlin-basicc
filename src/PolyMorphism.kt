fun main (){
    val shape = arrayOf(Circle(4.0),Square(4.0),
        Triangle(4.0,5.0))
    calculatearea(shape)
}
fun calculatearea(shape:Array<Shape>){
    for(s:Shape in shape){
        println(s.area())
    }
}
open class Shape{
    open fun area(): Double{
        return 0.0
    }
}
class Circle(val radius: Double):Shape(){
    override fun area(): Double {
        return Math.PI*radius*radius
    }
}
class Square(val side : Double):Shape(){
    override fun area(): Double{
        return side*side
    }
}
class Triangle(val base:Double, val height:Double):Shape(){
    override fun area():Double{
        return 0.5* base * height
    }
}