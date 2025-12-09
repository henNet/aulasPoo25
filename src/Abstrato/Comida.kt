package Abstrato

/* Classe abstrata */
abstract class Food(var name: String) {
    /* Metodo abstrato */
    abstract fun prepareFood()
}

class Pizza(name: String) : Food(name){
    override fun prepareFood() {
        println("Faz a massa com a borda, coloca o recheio e depois come.")
    }
}

fun main(){
    println("Questao Comida ...")
    var pizza = Pizza("Calabreza com borda cheeder");
    pizza.prepareFood();
}