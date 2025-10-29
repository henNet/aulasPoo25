package Heranca

open class Caneta {
    open fun mostrarCor(){
        println("Cor: preta");
    }
}

class Verde : Caneta(){
    override fun mostrarCor() {
        println("Cor: Verde");
    }
}

fun main(){
    println("Questao 1");
    var canetaB = Caneta();
    var canetaV = Verde();

    canetaB.mostrarCor()
    canetaV.mostrarCor()
}