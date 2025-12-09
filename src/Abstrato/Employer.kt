package Abstrato

abstract class Employee(
    var name: String,
    var baseSalary: Double)
{
    abstract fun calculateBonus()
}

interface Authenticable {
    fun authenticate(password: String) : Boolean
}

class Seller(name: String, baseSalary: Double) : Employee(name, baseSalary){
    override fun calculateBonus() {
        println("Salario com bonus: ${baseSalary + baseSalary * 0.2}")
    }
}

class Manager(
    name: String,
    baseSalary: Double) : Employee(name, baseSalary), Authenticable
{
    override fun calculateBonus() {
        println("Salario com bonus: ${baseSalary + baseSalary * 0.35}")
    }

    override fun authenticate(password: String): Boolean {
        println("Fazendo a checagem da senha ...")

        return true;
    }
}






