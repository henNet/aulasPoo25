package Estatico

class Jogador {
    var nome: String
    var nivel: Int

    constructor(nome: String, nivel: Int){
        this.nome = nome
        this.nivel = nivel
        qtJogadores++;
    }

    companion object {
        var qtJogadores = 0

        fun mostrarQtJOgadores(){
            println("Qt jogador: $qtJogadores")
        }
    }
}