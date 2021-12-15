import java.io.FileReader

import java.lang.Exception

fun main() {
    ReadFromFile()

    var str: String = readLine().toString()


}


fun ReadFromFile() {
    try {
        var fin = FileReader("Text")
        var c: Int?
        do {                          // at first read the file and check the condition
            c = fin.read()
            print(c.toChar())
        } while (c != -1)
    } catch (ex: Exception) {
        println(ex.message)
    }
}