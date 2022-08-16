fun main() {
   val a=Aclass()
    a.show()
}
interface myIn{
    fun show()
    fun write()
    fun update()
    fun delete()
}
class Aclass:myIn{
    override fun show() {
        print("Show")
    }

    override fun write() {
        print("Write")
    }

    override fun update() {
        print("Update")
    }

    override fun delete() {
        print("Delete")
    }

}