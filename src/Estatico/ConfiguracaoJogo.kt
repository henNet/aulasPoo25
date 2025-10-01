package Estatico

/* Classe totalmente estática (Singleton) */
object ConfiguracaoJogo {
    var volume = 50;
    var dificuldade = "Fácil"

    fun mostrarConfig(){
        println("-- Configurações do Jogo --");
        println("Volume: $volume \tDificuldade: $dificuldade")
    }

    fun danoPorDificuldade(): Int {
        var danoFinal = when(dificuldade){
            "Fácil" -> 1
            "Normal" -> 2
            "Dificil" -> 4
            "Modo Deus" -> 10
            else -> 15
        }

        return danoFinal
    }
}