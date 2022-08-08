fun main() {
    val dog=Dog("PHEa",11)
    println(dog.name)
}
class Dog(name:String){
    var name:String="Kiki"
    init{

        println("Dog's name is $name")
    }
    constructor( name:String,id:Int):this(name){
        this.name=name
    }
}