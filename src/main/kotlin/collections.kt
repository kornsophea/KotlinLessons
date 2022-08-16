fun main() {
    //immutable collection
    val list= listOf("Apple","Banana","Orange",1,3)
    val l= listOf<String>("Moon","Sun")
    val m= mapOf(1 to "Sky","S" to "Sun",7 to "Moon")
    val s= setOf<Int>(1,5,2,4,4,4,6)
    //mutable collection
    val data= arrayListOf<String>("Hello","Hi","World","Kotlin")

    data.add("C")
    data[1]="Java"
    data.remove("Kotlin")
    for( d in data){
        println(d)
    }

    val array=ArrayList<Int>()
    array.add(10)
    array.add(20)
    for(a in array){
        println(a)
    }

    val mutableArray= mutableListOf("Kotlin","Java","C++","C","Python")
    mutableArray.add("Hello")
    mutableArray.remove("Java")
    mutableArray[1]="Ruby"
    for(m in mutableArray){
        println(m)
    }

    val hashMap=HashMap<String,Int>()
    hashMap.put("Hello",50)
    hashMap.put("Hi",15)
    for ( h in hashMap){
        println(h)
    }

}