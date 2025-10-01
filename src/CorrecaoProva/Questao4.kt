package CorrecaoProva

class Conquista(private var nome: String, private var ponto: Int){
    companion object {
        var pontuacaoTotal = 0
        var conquistas = mutableListOf<Conquista>()
    }

    init {
        conquistas.add(this);
    }

    fun pegarNome(): String{
        return this.nome;
    }

    fun desbloquearConquista(){
        ConquistaManager.consquitaDesbloqueadas.add(this.nome);
        pontuacaoTotal += this.ponto;
        println("Conquista ${this.nome} desbloqueada - Pontos ${this.ponto}");
    }
}

object ConquistaManager {
    var consquitaDesbloqueadas = mutableListOf<String>();

    fun listarConquistasDesbloqueadas(){
        consquitaDesbloqueadas.forEach {
            println(it);
        }
    }
}

fun main(){
    println("Questao 4");
    var c1 = Conquista("Alma de aço", 100);
    var c2 = Conquista("Final do bem", 50);
    var c3 = Conquista("Nome do jogo", 80)
    var c4 = Conquista("Final do mal", 80)

    Conquista.conquistas.forEach { println(it.pegarNome()) }

    c1.desbloquearConquista();
    c4.desbloquearConquista();

    ConquistaManager.listarConquistasDesbloqueadas()
    println("Pontuacao total: " + Conquista.pontuacaoTotal);
}