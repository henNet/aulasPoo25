package Revisao

/* Questao 1 - Forma de bolo para se criar objetos alunos */
class Aluno (
    var nome: String,
    var idade: Int,
    var altura: Double
)

/* Questao 2 */
class Moto(var placa: String, var ano: Int, var modelo: String, var cor: String)

fun main(){
    /* Questao 1 */
    var aluno1 = Aluno("Ana", 23, 1.56);
    var aluno2 = Aluno("Clara", 19, 1.57);

    /* Questao 2 */
    var moto1 = Moto("UHN-1234", 2025, "R-15", "Preto")
    var moto2 = Moto("PON-1234", 2025, "Bros", "Azul")

    /* Questao 3 */
    var produtoA = Produto("PS5", "Video Game", 3500.0);
    var produtoB = Produto("Caixa JBL", "Eletronico", 170.0);

    produtoA.mostrar();
    produtoB.mostrar();

    /* Questao 4 */
    var jogo1 = Jogo("GTA VI", 1000, "Ação Bagunça", "RockStars", 1000000, 1000000);
    var jogo2 = Jogo("Assassins Creed - Mirage",
                    1000, "RPG Stealth", "Ubisoft", 1000000, 1000000);

    jogo1.mostrar()
    jogo2.mostrar()

    /* Questao 5 */
    println("Digite o nome do funcionario: ");
    val nome = readln();

    println("Digite o cargo do funcionario: ");
    val cargo = readln();

    println("Digite a hora extra do funcionario: ");
    val hExtra = readln().toInt();

    val funcionario = Funcionario(nome, cargo, horaExtra = hExtra)
    funcionario.salarioTotal();
}