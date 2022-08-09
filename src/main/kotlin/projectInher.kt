import java.util.Scanner

fun main() {
//  val stu=SStudent("Moon","Male",1000.0)
//    stu.inputDataStu()
//    stu.showDataStu()
//    val p=BPerson("nn","ma")
//    println(p.name)
    val t=STeacher("Cat","Male",100.0,200.0)
    t.inputDataStu()
    t.showDataTeacher()
}
open class BPerson(name:String,sex:String){
    var name:String="N/A"
    var sex:String="N/A"
    var sc=Scanner(System.`in`)

    init{
        this.name=name
        this.sex=sex
    }
    fun inputData(){
        println("Input Name : ")
        name=sc.next()
        println("Input Sex : ")
        sex=sc.next()
    }
    fun showData(){
        print("$name\t$sex\t")
    }
    @JvmName("getName1")
    fun getName():String{
        return this.name
    }
    @JvmName("getSex1")
    fun getSex():String{
        return this.sex
    }
    @JvmName("setName1")
    fun setName(name:String){
        this.name=name
    }
    @JvmName("setSex1")
    fun setSex(sex:String){
        this.sex=sex
    }
}
open class SStudent(name:String,sex:String,score:Double):BPerson(name,sex){
    var score:Double=0.0
    init {
        this.score=score
    }
    fun showDataStu(){
        super<BPerson>.showData()
        print("$score\t")
    }
    open fun inputDataStu(){
        super<BPerson>.inputData()
        println("Input Score ")
        score=sc.nextDouble()
    }
}
class STeacher(name:String,sex:String,score:Double,salary:Double):SStudent(name,sex,score){
    var salary:Double=0.0
    init{
        this.salary=salary
    }
    override fun inputDataStu() {
        super.inputDataStu()
        println("Input Salary : ")
        salary=sc.nextDouble()
    }
    fun showDataTeacher(){
        super<SStudent>.showDataStu()
        print("$salary")
    }
}
