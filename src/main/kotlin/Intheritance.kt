import java.util.PrimitiveIterator

fun main() {
    print(people.name)
    val s= Students()
    val m=moon("PHEa","MALE")
    print(m.mo())

}
open class Persons{
    open var name:String="N/A"
    open var sex:String="N/A"
    open fun outputData(){
        print("$name\t$sex\t")
    }
    @JvmName("getName1")
    fun getName():String{
        return this.name
    }
    @JvmName("setName1")
    fun setName(name:String){
        this.name=name
    }


}
class Students:Persons(){
    override var name:String="Phea"
    override var sex: String="Male"
    

    var score:Int=100
//    override fun outputData(){
//        super<Persons>.outputData()
//        print("$score")
//    }
    fun outputStudents(){
        super<Persons>.outputData()
        print(sex)
    }

    companion object{
        fun haha(){
            println("HAhass")
        }
    }

}class Teachers{

}
object people{
    var name:String ="Moon"
}
data class moon(val name: String,val sex:String){
     fun mo(){
        print("AA")
    }
}
