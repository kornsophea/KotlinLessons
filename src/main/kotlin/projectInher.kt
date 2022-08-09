import java.util.Scanner

fun main() {
  val stu=SStudent("Moon","Male",1000.0)
    stu.inputDataStu()
    stu.showDataStu()
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
}
class SStudent(name:String,sex:String,score:Double):BPerson(name,sex){
    var score:Double=0.0
    init {
        this.score=score
    }
    fun showDataStu(){
        super<BPerson>.showData()
        print("$score")
    }
    fun inputDataStu(){
        super<BPerson>.inputData()
        println("Input Score ")
        score=sc.nextDouble()
    }
}
