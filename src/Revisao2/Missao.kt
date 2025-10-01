package Revisao2

class Missao(var descricao: String) {

    companion object {
        var pontosTotal = 0;

        fun mostrarPontoTotais(){
            println("Pontuação Total: $pontosTotal");
        }
    }

    fun concluir(){
        pontosTotal += 100;
    }
}