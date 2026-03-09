fun main (){
    var order1 = Pizza.Factory.Create("Tomato")
    println(order1)

    var order2 = Pizza.Create("Peppy Paneer")
    println(order2)

}
class Pizza(val Type:String,val Toppings: String) {
   companion object Factory {
        fun Create(PizzaType: String): Pizza {
            return when(PizzaType){
                "Tomato"->Pizza("tomato","Tomato Cheese")
                "Peppy Paneer"->Pizza("paneer Farmm","paneer,Cheese Burst,Tomato,Onion")
                else -> Pizza("Basic","Onion,Cheese")

            }


        }
    }
    override fun toString():String{
        return "pizza(type='$Type',toppings='$Toppings')"
    }
}