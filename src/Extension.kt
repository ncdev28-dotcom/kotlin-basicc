fun main(){
    println("hello world".formatedString())
}
fun String.formatedString(): String{
    return "------------\n$this\n------------"
}