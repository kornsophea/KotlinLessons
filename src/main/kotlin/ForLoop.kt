fun main() {
    for(i in 1..10){
        print(i)
    }
    for(a in 10 downTo 1){
        print(a)
    }
    for(x in 1..20 step 3){
        println(x)
    }
    for(x in 30 downTo 1 step 4){
        println(x)
    }
    val list= listOf<String>("Apple","Orange","Banana","Grape","Banana")
    var l=list.distinct()
     for(i in l){
         println(i)
     }


}