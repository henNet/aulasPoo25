package Encapsulamento

class Contador {
    private var cont = 0;
    var teto: Int;

    constructor(t: Int){
        this.teto = t;
    }

    fun zerar(){
        cont = 0;
    }

    fun aumentar(){
        cont++;
        checarTeto();
    }

    private fun checarTeto(){
        if(cont > teto)
            zerar();
    }

    fun mostrarContadorAtual()
    {
        println("Contador: ${cont}");
    }
}