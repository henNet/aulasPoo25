package Revisao

class Produto(
    var nome: String,
    var tipo: String,
    var valor: Double)
{
    fun mostrar(){
        println("--- Informações do Produto ---")
        println("Nome: ${nome}");
        println("Tipo: ${tipo}");
        println("Valor: ${valor}");
    }
}