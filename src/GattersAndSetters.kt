import java.util.Locale
import java.util.Locale.getDefault

fun main (){
    val mahesh=person(nameparam = "Mahesh", Ageparam = 25)
    println(mahesh.Age)
    println(mahesh.name)
    mahesh.Age=-20
}
class person (nameparam: String, Ageparam: Int){
    var name: String= nameparam
        get() {
            return field.uppercase(getDefault())
        }
    var Age: Int=Ageparam
        set(value) {
            if (value>0){
                field=value
            }
            else{
                println("age can't be negative")
            }

        }
}