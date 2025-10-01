package Encapsulamento

fun main(){
    println("Apredendo Encapsulamento")

    var denis = Pessoa()

    println("Digite um nome: ")
    val n = readln();

    denis.nome = null;
    denis.nome = n;
    println(denis.nome)

    denis.nome = "cnjdnckfjvnf"

    denis.fazerAniversario()
    println(denis.nome);
    println(denis.nome);
}