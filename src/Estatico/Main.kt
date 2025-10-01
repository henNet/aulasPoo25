package Estatico

class Circulo {
    var raio = 3.0;

    companion object {
        var PI = 3.14;

        fun mostrarPI(){
            println("PI: $PI");
        }

        fun areaCirculo(raio: Double) : Double {
            return PI * raio * raio;
        }
    }
}

fun main(){
    println("Mexendo com estáticos");

    var circ = Circulo();
    circ.raio = 20.0;
    Circulo.areaCirculo(circ.raio);

    println(Math.PI);

    ConfiguracaoJogo.volume = 80;
    ConfiguracaoJogo.dificuldade = "Dificil"
    ConfiguracaoJogo.mostrarConfig();

    var odin = InimigoE("Odin Bezerra", 100);
    var mrx = InimigoE("Mr. X Bezerra", 100);

    odin.receberDano(25);
    mrx.receberDano(110);

    InimigoE.mostrarQtInimigosDerrotados();

    var kratos = Jogador("Krato", 5)
    var faker = Jogador("Falker", 2)
    var leon = Jogador("Leon", 3)
    var hornet = Jogador("Hornet", 5)

    Jogador.mostrarQtJOgadores();
}





