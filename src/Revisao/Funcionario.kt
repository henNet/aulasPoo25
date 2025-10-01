package Revisao

class Funcionario(
    var nome: String,
    var cargo: String,
    var salario: Double = 2500.00,
    var horaExtra: Int
) {
    fun salarioTotal(){
        salario = salario + salario * 0.05 * horaExtra;
        println("Salario: ${salario}");
    }
}