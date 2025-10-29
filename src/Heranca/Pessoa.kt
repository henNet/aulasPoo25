package Heranca

open class Pessoa(var nome: String) {

    open fun boasVindas(){
        println("Bem vindo $nome");
    }
}

class Estudante(nome: String, var escola: String) : Pessoa(nome) {
    override fun boasVindas() {
        println("Bem vindo $nome da escola $escola");
    }
}

fun main(){
    println("Questao 2");
    var pessoa = Pessoa("Neto");
    var estudante = Estudante("Gabriel", "Murilo Serpa");

    pessoa.boasVindas();
    estudante.boasVindas();
}