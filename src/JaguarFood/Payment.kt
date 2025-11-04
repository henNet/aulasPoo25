package JaguarFood

open class Payment(var totalPrice: Double) {
    open fun showInfo(){
        println("Preco total: $totalPrice");
    }
}

class Jix(
    totalPrice: Double,
    val jixKey: String) : Payment(totalPrice) {
    override fun showInfo() {
        super.showInfo()
        println("Chave Jix: $jixKey");
    }
}

class Credicard(
    totalPrice: Double,
    val cardNumber: String,
    var parcels: Int
) : Payment(totalPrice) {
    override fun showInfo() {
        super.showInfo()
        println("Cartao final: ${cardNumber.takeLast(4)}");
        println("Parcelas: $parcels");
    }
}







