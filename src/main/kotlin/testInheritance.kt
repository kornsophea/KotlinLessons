

fun main() {
     val s=Sub("Moon","Male")


}
open class BasePerson{
    constructor(name:String,sex:String)
}
class Sub(name:String,sex:String):BasePerson(name,sex){

}
