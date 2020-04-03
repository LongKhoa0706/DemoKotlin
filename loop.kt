fun main(args: Array<String>) {
    //for,while,do while
    // 1 => 10


    // increase
    for(item in  1..10){
      
    }

    println("-------------")

    
    for(item in 1 until 10 ){
        
    }

    println("-------------")

    var number = 1..10
    for(item in  number){
    }

    // decrease 
    for(item in 10 downTo 1 ){
       
    }

    // increase two point 
    for(item in 1..10 step(2)){
        
    }

    //white 
    var item = 10
    while(item <15){
     
        item++;
    }
    var item1 = 10
    // do white
    do{

    
        item1++;
    }while(item1<15)

    //loop

    loop@ for(i in 1..3){
        for(j in 1..3){
            println("i = $i <=> j = $j ")
            if(j>i){
                break@loop
            }
        }
        println(" i = $i")
    }

}