import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.seconds
import kotlin.time.days

fun main() {
    val data = arrayListOf<Int>(10,10,20,10,1,5,7,2,2)

//    val item=data.filter { num->num<10}//fill data lest than  10
    val item=data.filter { it<10}
    for (i in item){
        println(i)
    }
//    val element=data.map { num->num+20 }
    val element=data.map { it*10 }
    for(i in element){
        println(i)
    }

//    val a=data.all{num->num<10}
    val a=data.all{it<10}
    println(a)
//
//    val b=data.any{it<10}
    val b=data.any{value->value<10}
    println(b)
}