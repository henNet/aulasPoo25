package Revisao

class Jogo(
    var nome: String,
    var qtFases: Int,
    var genero: String,
    var desenvolvedora: String,
    var qtJogadoresOnline: Int,
    var qtJogadoresOffline: Int
) {
    fun mostrar(){
        println("--- Informações do Jogo --- ");
        println("Nome: ${nome}");
        println("Genero: ${genero}");
        println("Desenvolvedora: ${desenvolvedora}");
    }
}