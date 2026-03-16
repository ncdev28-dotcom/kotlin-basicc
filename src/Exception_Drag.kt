fun main(){
     CreateUserList(15)
    CreateUserList(-20)

}
fun CreateUserList(count: Int){
    if (count<0){
        throw IllegalArgumentException("count must be grater than 0")
    }
    else{
        println("User list created containing $count users")
    }
}