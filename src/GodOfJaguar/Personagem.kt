package GodOfJaguar

class Personagem(
    var nome: String,
    var vida: Int = 100,
    var level: Int = 1)
{
    fun atacar(tipoAtaque: String){
        println("Atacando com $tipoAtaque");
    }

    fun apanhar(qtDano: Int){
        vida = vida - qtDano;

        if(vida > 0) {
            println("Apanhei ... vida atual $vida");
        }else {
            println("Game Over")
        }
    }
}