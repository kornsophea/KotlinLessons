fun main() {

    for(i in 1..10){
        print(i)
    }
    for(i in 10 downTo 1){
        print(i)
    }
    for(i in 1..20 step 2){
        print(i)
    }
    var a=10
    while(a>0){
        print(a)
        a--
    }
    do {
        print(a)
       a--
    }while(a>0)
}