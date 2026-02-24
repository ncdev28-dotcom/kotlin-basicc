fun main (){
    var result = add(number1 = 10 , number2 = 15)//arguments
    println(result)
    result = add(number1 = 15 , number2 = 30)
    println(result)

    evenorodd(number1 = 15)
    evenorodd(number1 = 10)
}
fun add(number1: Int, number2: Int ) = number1 + number2

fun evenorodd(number1: Int)//number1  perameters
{
    val result = if(number1 %2 == 0)"even" else "odd"
    println(result)
}