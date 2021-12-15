import java.io.FileWriter
import java.lang.Exception

fun main(){

    // extra function i wii add
    println(" 1. if you want read only press 1 \n 2. if you want write only press 2")
    val op:Int= readLine()!!.toInt()
    when(op){
        1->{
            ReadFromFile()
        }
        2->{
            println("Write to file text:")
            var str:String= readLine()!!.toString()
            WriteToFile(str)
        }
    }

  /*  println("Write to file text:")
    var str:String= readLine()!!.toString()
    WriteToFile(str)*/
}

fun WriteToFile(str:String){
    try {
        var fo=FileWriter("Text",true)
        fo.write(str+"\n")
        fo.close()
    }catch (ex:Exception){
        println(ex.message)
    }
}