import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) {
   print(randomID())
}
private fun randomID(): String = List(16) {
    (('a'..'z') + ('A'..'Z') + ('0'..'9')).random()
}.joinToString("")

