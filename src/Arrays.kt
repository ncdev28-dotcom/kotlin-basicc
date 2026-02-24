fun main (){
    var arr = arrayOf("one","two","three")
    for ((i: Int ,e:String) in arr.withIndex())
    {
        println("$i-$e")

    }
    println(arr[0])
    println(arr.size)
}