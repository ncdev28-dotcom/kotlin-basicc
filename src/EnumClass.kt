fun main (){
    val day=Day.Wednesday
    println(day)
    println(day.number)
    for(i in Day.values()){
        println(i)
    }
    day.PrintFormatedDAy()
}
enum class Day(val number:Int){
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Friday(6),
    Saturda(7);
    fun PrintFormatedDAy(){
        println("Day is $this")
    }
}