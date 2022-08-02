fun main() {
    val list= listOf<Int>(10,2,5,6,8,2,7)
    println("Size of List ${list.size}")
    println("Minimum number of list : ${list.min()}")
    println("Minimum number of list : ${list.max()}")
    println("Select with distinct : ${list.distinct()}")
    println("Sort list by Ascending : ${list.sorted()}")
    println("Sort list by Ascending : ${list.sortedDescending()}")
    val l=list.sortedDescending()
    for(i in l){
        println(i)
    }
    println("${list.indices}")
    val index=list.indices
    for(i in index){
        println("Index of list $i")
    }
    println("Last Number ${list.last()}")
    println("First Number ${list.first()}")
    println( "Number of index 3: ${list[3]}")
}