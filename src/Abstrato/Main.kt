package Abstrato

abstract class Sound {
    var volume = 0;

    /* Metodo abstrato */
    abstract fun showInfo()

    /* Metodo concreto */
    fun showVolume(){
        println("Volume: $volume")
    }
}

private interface Control {
    fun volumeMore()
    fun volumeLess()
}

class CarSound : Sound(), Control {
    override fun showInfo() {
        println("Som Automotivo")
    }

    override fun volumeLess() {
        volume--;
    }

    override fun volumeMore() {
        TODO("Melhorar")
        volume++;
    }
}

class HomeSound : Sound() {
    override fun showInfo() {
        println("Som doméstico")
    }
}

fun main(){
    println("Aprendendo classes abstratas e interfaces");
    var sCar = CarSound();
    var sHome = HomeSound();

    sCar.showInfo()
    sCar.volume = 20;
    sCar.showVolume();
    sHome.showInfo()
}