import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) {
   print(randomID())
    print(randomUserID())
}
private fun randomID(): String = List(16) {
    (('a'..'z') + ('A'..'Z') + ('0'..'9')).random()
}.joinToString("")
private fun randomUserID(): String =List(8){
    (0..9).random()
}.joinToString ("")

