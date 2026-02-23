fun main (){
    val above70 = true
    val knowcoding = false
    //&& And aa opertors ma 2y condition true thase
    // to j answer true aavse nahi to false aavse
    // 1 condition j false thase to pachini condition execute j nai kare
    var calledforinterview= above70 && knowcoding
    println(calledforinterview)

    // || or if 1 condition is true
    // 1 condition true thai jase to pachi ni condition execute j nai kare
    calledforinterview = above70 || knowcoding
    println(calledforinterview)
   // ! Not opertator
    // false ---> !---> true
    // true ----> !---> false
    val answer = false
    val result = !answer
    println(result)//true ans aavse
}