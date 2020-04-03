fun main(args: Array<String>) {
    var student = Student();
    println(student.name)
    student.showInfo()

    val customer = Customer()
    customer.showInfoCustomer()
}

class Student {
    var name = "LongKhoa"
    var age = 25

    fun showInfo(){
        println(this.name)
        println(this.age)
    }

}

class Customer  (var name: String = " ", var phone : String = "") {
    init {
        name = "Longkhoacvvvvv"
        phone = "1341434243"
    }
    fun showInfoCustomer(){
        println(this.name)
        println(this.phone)
    }

    constructor(email : String ) : this()

} 