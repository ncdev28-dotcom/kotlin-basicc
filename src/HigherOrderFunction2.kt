fun main(){
    val nums=listOf<Int>(1,2,3,4,5)
    val list = nums.filter(fun(a: Int): Boolean {
        return a % 2 != 0
    })
    val list2 = nums.filter { it % 2 != 0 }//lambda
    println(list)
    println(list2)
    val userlist=listOf<user>(
        user(1,"nik"),
        user(2,"chauhan"),
        user(3,"rahul")
    )
   println( userlist.filter{it.id ==2})//lambda
    val list3=nums.map { it*it }//map
    println(list3)
    val paiduserlist = userlist.map {
        paiduser(it.id,it.name,"paid")
    }
    println(paiduserlist)
    nums.forEach { println(it) }
}

data class user(val id: Int, val name:String)
data class paiduser(val id: Int,val name: String, val type:String)