fun main(){
    Sharingwidgate.IncrementTwitterLikes()
    Sharingwidgate.IncrementFbLIkes()
    Sharingwidgate.IncrementTwitterLikes()
    Sharingwidgate.IncrementTwitterLikes()
    Sharingwidgate.IncrementFbLIkes()
    Sharingwidgate.display()
}
object Sharingwidgate{
    private var TwitterLikes = 0
    private var FbLikes = 0
    fun IncrementTwitterLikes()=TwitterLikes++
    fun IncrementFbLIkes()= FbLikes++
    fun display() = println("Facebook - $FbLikes -- Twitter - $TwitterLikes ")
}