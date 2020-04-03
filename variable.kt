fun main(args: Array<String>) {
   
    //mutable , imutable
    var email : String = "Hell111oWord"

    email = "Longkhoa11111111"
    
    val name  = "abc@gmail.com"
    

    //int,Long,Float,String, Hex,Binaray,Char

    val age: Int = 11
    var ageLong: Long = 10L
    val ageFloat : Float = 10.1F
    val ageHex : Int = 0xFF
    val ageBinary : Int = 0xb11
    var ageChar : Char = 'A'
    val ageString : String = "ABCDERT"

    //demo String
    val str1 = "I am " + " Kotlin"
    val line = """
     SELECT *
     FROM users
     WHERE
     email = "abc@gmail.com
    """
    println(line)

    val ageString1 = "i am $age "
    val ageString2 = "i am ${age + 1 } "
    println(ageString2)

}