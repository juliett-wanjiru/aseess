import jdk.jfr.Category

fun main(){
    var s = currentAccount(23,"equity",4)
    println(s)






}
 open class currentAccount(number:Int,name:String,balance:Int){
    fun deposit(amount:Double){
       var newBalance = 3
        newBalance++
        println(newBalance)


    }
    fun withdraw(Amount:Double){
        var decrementAction = 0



    }
    fun details(x:String,y:Int,z:String){
        var statement = "account $x  with balance $y is operated by $z"
        println(statement)
    }
}
 class savingAccount(number: Int,name: String,balance: Int): currentAccount(number, name, balance ){
    fun withdrawalS(amount: Int){
        var withdrawal = 0
        if(amount<=4 )
            println(withdrawal)
        }

     }



data class Product(val name:String,var weight:Int,var price:Int)


