fun main() {
   val p=Person(1,"Moon","Female")
    p.newData()
}
class Person(id:Int,name:String,sex:String){//
     var id:Int=100
     var name:String="Phea"
     var sex:String="Male"
    init {
        println("$id \t $name \t $sex \t ")
    }
    fun position(){
        println("He is a student")
    }
    fun newData(){
        println("$id \t $name \t $sex  ")
    }

}
//Encapsulation  Inheritance  Polymorphism Abstract
//person id name sex
//student subject class
//teacher