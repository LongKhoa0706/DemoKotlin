fun main(args: Array<String>) {
    sayHello1()
    val age = getAge();
    
    val sum = sum(5, 3)
  
    // val status = callApi()
    // if(status == 400){
    //     error("Fail")
    //     showErrorUI()
    // }

    val sum2 = sum2(1,2,3,4)
    
        printSum(4,5)

        showInfo("abc@gmail.com", "TEST")


}
fun callApi() = 400

fun showErrorUI() {
    println("show error UI")
}

fun sayHello(){
    print("ALO")
}

// void 
fun sayHello1() : Unit {
    println("return void or unit")
}

// fucntuon return type
fun getAge() : Int{
    return 25
}

fun sum(x : Int, y : Int) : Int {
    return x + y
}

// demo return nothing
fun error(msg : String) : Nothing {
    throw Exception(msg)
}

// unlimited parametter
fun sum2(vararg ints : Int) : Int{
    var sum = 0 ;
    for (i in ints) {
        sum += i
    }
    return sum
}

fun printSum(vararg ints : Int){
    val sum = sum2(*ints)
    println("KET QUA $sum ")
}

fun showInfo(email : String , name : String) {
    println(email)
    println(name)
}