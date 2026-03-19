fun main(){
    Calculater(5.0,10.0,::Sum)
}
fun Sum(a: Double, b: Double): Double{
    return a+b
}
fun Calculater(a: Double, b: Double, addon:(Double, Double)-> Double){
    val result=addon(a,b)
    println(result)
}