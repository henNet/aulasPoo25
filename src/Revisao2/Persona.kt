package Revisao2

class Persona(private var vida: Int = 100) {

    fun receberDano(valor: Int){
        vida -= valor
        if(vida <= 0)
            println("Bate mais não que ja morri!");
    }

    fun receberCura(valor: Int){
        vida += valor
        if(vida >= 100) {
            vida = 100;
            println("Vida 100% já!");
        }
    }
}