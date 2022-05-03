import java.util.*

class PrintSalary {

    fun printSalary(){
        val manager = Manager()
        val operator = Operator(hoursWorked = 230)
        val accountant = Accountant()

        println("Escriba el número del rol(1: Manager, 2:Operador, 3:Contador) despues pulse enter")
        val scan = Scanner(System.`in`)
        val rol = scan.nextLine()

        val  salary = Salary()
        val result: String
        when (rol) {
            "1" -> result = salary.calculateSalary(manager)
            "2" -> result = salary.calculateSalary(operator)
            "3" -> result = salary.calculateSalary(accountant)
            else -> result = "El numero ingresado no corresponde a ningun rol"
        }
        println(result)
    }

}