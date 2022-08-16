fun main() {
   val b=B("Cat","Female")

    b.show()
}
abstract class A{
    abstract var name:String
    abstract var sex:String
    abstract fun show()
}
class B(override var name: String, override var sex: String):A(){
    override fun show() {
        print("$name\t$sex")
    }
}