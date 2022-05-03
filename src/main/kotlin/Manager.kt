class Manager(private var hoursValue: Double = 200.0, private var hoursWorked: Int = 200):Employee(hoursValue, hoursWorked){
    override fun salary(): String {
        var additionalHours: Int = (hoursWorked-200)
        var bonus: Double = hoursValue*(additionalHours-additionalHours%10)
        var baseSalary: Double = hoursValue*(hoursWorked-additionalHours)

        return "El salario del gerente es: ${if (hoursWorked>210)"${bonus+baseSalary} (Ha ganado un bono de ${bonus})" else baseSalary}"
    }
}