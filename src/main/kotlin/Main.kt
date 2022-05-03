fun main(args: Array<String>) {
    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.

    val manager = Manager()
    val operator = Operator(hoursWorked = 230)
    val accountant = Accountant()

    val  salary = Salary()
    val result: String
    when (args[0]) {
        "1" -> result = salary.calculateSalary(manager)
        "2" -> result = salary.calculateSalary(operator)
        "3" -> result = salary.calculateSalary(accountant)
        else -> result = "El numero ingresado no corresponde a ningun rol"
    }
    println(result)

}