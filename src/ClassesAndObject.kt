import javax.print.DocFlavor

fun main(){
    val rajesh = Person(name = "Rajesh", Age = 20)
    val suresh = Person(name = "Suresh", Age = 17)
    println(rajesh.canvote())
    println(suresh.canvote())

}
class Person(val name: String, var Age: Int){  //properties
    //methods
    fun canvote(): Boolean{
        return Age>=18
    }

}