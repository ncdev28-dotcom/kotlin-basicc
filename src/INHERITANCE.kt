fun main(){
    val result = child("nikhil")
    result.myMethod()
    result.myMethod2()
    println(result.name)

}
open class parent(val name: String)
{
    fun myMethod(){
        println("I am in parent")
    }
}
class child(name: String):parent(name){
    fun myMethod2(){
        println("I am in child")
    }
}