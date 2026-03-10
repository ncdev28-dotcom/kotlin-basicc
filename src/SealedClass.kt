fun main(){
    val result =Red("mashroom",25)
    val result2 =Red("fire",30)
    println("${result.Points}-${result.Type}")
    val tile:Tile=Red("mashroom",20)
    val points=when(tile){
        is Red ->tile.Points * 2
        is Blue -> tile.Points *2

    }
    println(points)
}
sealed class Tile

class Red(val Type: String,val Points: Int):Tile()
class Blue(val Points: Int):Tile()