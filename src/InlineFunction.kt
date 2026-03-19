fun main(){

    CalculateTimeAndRun {
        Loop(111111111)
    }

}
fun Loop(n: Long){
    for (i in 1..n){

    }
}
 inline fun CalculateTimeAndRun(fn:()-> Unit){
    val Start =System.currentTimeMillis()
    fn()
    val End = System.currentTimeMillis()
    println("Time taken = ${End-Start}ms")
}