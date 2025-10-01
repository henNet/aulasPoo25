package JaguarFit

class Plano {
    var nome: String
        private set

    private var preco: Double;
    var qtDias: Int;

    constructor(n: String, p: Double, d: Int){
        nome = n;
        preco = p;
        qtDias = d;
    }

    fun mostrarPlano() {
        println("-- Dados do Plano --")
        println("Nome: ${nome}")
        println("Preço: ${preco}")
        println("Dias: ${qtDias}")
    }
}