package JaguarFit

class Treino(
    var descricao: String,
    var qtMinutos: Int)
{
    fun mostrarTreino(){
        println(" - Treino: ${descricao} (${qtMinutos}m)");
    }
}