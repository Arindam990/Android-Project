

fun main() {
     try {
         println("Enter the number")
         var num1: Int = readLine()!!.toInt()
         var div = 100 / num1
         println("ans is $div")
     } catch(ex:Exception){
         println(ex.message)
     }

   println("done")
 }