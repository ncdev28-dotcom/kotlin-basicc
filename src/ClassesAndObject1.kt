fun main(){
    val mustang = car(names = "mustang", type ="petrol", kmran = 15000 )
    val swift = car(names = "swift", type = "diesel", kmran = 25000)
    println(mustang.type)
    println(swift.names)
    println(mustang.names)
    mustang.drivecar()
    swift.drivecar()

}
class car (val names: String, val type: String,var kmran: Int)//properties
{
    fun drivecar(){//methods
        println("${names} car is driving")

}
    fun applybrakes(){
        println("Applied Brakes")
    }
}