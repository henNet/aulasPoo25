package JaguarFood

class Order(
    val client: Client,
    val company: Company,
    val foods: MutableList<Foods> = mutableListOf<Foods>()
) {
    fun realizarPedido(){
        println("Realizando pedido ...");
    }
}