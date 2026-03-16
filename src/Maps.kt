fun main (){
    val students=mutableMapOf<Int, String>()
    students.put(1,"nikhil")
    students.put(2,"gopal")
    students.put(3,"jago")
    println(students.get(2))

    for ((key,value ) in students){
        println("$key = $value")
    }
    val map=mapOf<Int, String>(1 to "Hello", 2 to "World")
    println(map)
}