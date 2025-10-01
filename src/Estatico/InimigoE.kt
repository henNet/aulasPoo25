package Estatico

class InimigoE(var nome: String, var vida: Int) {
    companion object {
        var qtInimigosDerrotados = 0;

        fun mostrarQtInimigosDerrotados(){
            println("Qt: $qtInimigosDerrotados");
        }
    }

    fun receberDano(dano: Int){
        vida -= dano * ConfiguracaoJogo.danoPorDificuldade();
        if(vida <= 0){
            println("Inimigo derrotado: $nome");
            qtInimigosDerrotados++;
        }
    }
}