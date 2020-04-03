fun main(args: Array<String>) {
    val number = (1..100).random()

    println(number)

    if(number %2 == 0){
        println("so chia het cho 2 $number")
    }else{
        println("so ko chia het cho 2 la  $number")
    }

    // when <=> swich case 

    when(number){
        in 1..10 -> {
            print("TRE con ")
        }
        in 40..60 -> {
            print(" LON TUOI")
        }
        else -> {
            print("ko biet")
        }
    }
    
    for (item in number.downTo(2)) {
        println(item)
    }

     

}