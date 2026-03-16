fun main(){
    Calculater(5.0,10.0,::Sum)
}
fun Sum(a: Double, b: Double): Double{
    return a+b
}
fun Calculater(a: Double,b: Double,addfn:(Double, Double)-> Double){
    val result=addfn(a,b)
    println(result)
}