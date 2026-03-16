fun main (){
    val nums= mutableListOf<Int>(1,2,3)
    println(nums.indexOf(2))
    println(nums.contains(4))
    nums[1]=3
    nums.add(5)
    nums.remove(1)
    println(nums)
    val list2=listOf<Int>(11,12)
    nums.addAll(list2)
    println(nums)
}