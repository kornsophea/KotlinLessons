fun main() {
    val list = listOf<Int>(1,2,8,6,2,20,15,9)
    println(list.filter { num ->num<10})
    println(list.map { num ->num*10})
    println(list.all {it<5})
    println(list.any{it>10} )
    println(list.count {it<10})
}