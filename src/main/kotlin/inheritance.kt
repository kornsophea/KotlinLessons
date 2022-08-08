fun main() {
    val s=Student1()
    s.activeStudent()

}
open class Person1{//Super Base Parent
     open var name:String="Moon"//public final by default
     open var sex:String="Male"
     fun active(){
        print("$name\t$sex\t")
    }

}
class Student1:Person1(){//Sub Child Diried
     var score:Double=1000.0
     fun activeStudent(){
         super<Person1>.active()
        print("$score")
    }
}
