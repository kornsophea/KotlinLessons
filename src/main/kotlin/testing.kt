fun main() {
   val sub=Sub1()
}
open class Base1{
    init {
        println("Base1")
    }
}
interface Base2{
    fun show(){
        print("Base2")
    }
}
class Sub1:Base1(),Base2 {
     init {
         super<Base2>.show()
         println("Sub1")
     }
}