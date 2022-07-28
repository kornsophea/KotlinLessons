fun main() {
    sum()
    sub(10,5)
    val result=mul()
    println(result)
    val res=dev(10,2)
    println(res)
}
fun sum(){
    var x:Int=10
    var y:Int=30
    println(x+y)
}
fun sub(x:Int,y:Int){
    println(x-y)
}
fun mul():Int{
    var a:Int=20
    var b:Int=30
    return a*b
}
fun dev(a:Int,b:Int):Int{
    return a/b
}