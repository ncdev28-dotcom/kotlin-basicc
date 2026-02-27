fun main(){
    val result = Child("nikhil")
    result.myMethod()
    result.myMethod2()
    println(result.name)

}
open class Parent(val name: String)
{
    fun myMethod(){
        println("I am in Parent")
    }
}
class Child(name: String):Parent(name){
    fun myMethod2(){
        println("I am in Child")
    }
}