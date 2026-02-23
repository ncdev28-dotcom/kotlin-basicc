fun main() {
    val knowcoding = false
    val boy = 11
    val girl = 15
    val result =if(boy % 2==0)"boy's age is Even" else "boy's age is odd"
    val result2 = if(girl % 2==0)"girl's age is Even" else "girl's age is odd"

    if (knowcoding == true) {
        println("you got the job")
    } else {
        println("sorry batter luck next time")
    }
    if(boy>girl) {
        println("boy is older than girl")
    }else if(boy<girl){
            println("boy is youngr than girl")
    }
    else{
        println("both are same age")
    }
    println(result)
    println(result2)
}
