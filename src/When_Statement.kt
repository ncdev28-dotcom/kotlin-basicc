fun main(){
    var number = 17
    val result =when(number){
       11-> "eleven"
        12-> "twelve"
    in 13..20 -> "thirteen to twenty in range"
        else -> "not in range"

    }
    println(result)
}