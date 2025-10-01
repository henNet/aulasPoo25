package GodOfJaguar

class Chefao(var nome: String = "") {
    var poder = "";

    constructor(nome: String, tipo: String): this(nome) {
        when(tipo){
            "Deus" -> this.poder = "Magia";
            "SemiDeus" -> this.poder = "Super força";
            "Valkria" -> this.poder = "Infinito";
            else -> this.poder = "Poder Normal";
        }
    }
}