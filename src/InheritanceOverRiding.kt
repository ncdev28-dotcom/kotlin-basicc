fun main (){
    val samsung = Samsumg()
    samsung.display()
    println(samsung.name)
    val phone = BasicMobile("basic phone")
    phone.display()
    println(samsung.size)
    println(samsung.type)

}
open class BasicMobile(val type: String){
    open val name: String=""
    open val size: Int = 5
    fun MakeCall() = println("callimg From Mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}
class Samsumg():BasicMobile("smartphone"){
    override val name: String ="samsung"
    override fun display() = println("$name Mobile Display")
    override val size: Int = 6
}