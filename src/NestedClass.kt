fun main(){
    val obj=Outer()
    println(obj.i)

    val inner = Outer().Nested()
    inner.test()


}
class Outer{
    val i = 0

     inner class Nested {
        fun test(){
            println("I am nested $i")
        }
    }
}