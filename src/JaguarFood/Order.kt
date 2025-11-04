package JaguarFood

class Order(
    val client: Client,
    val company: Company,
    val foods: MutableList<Foods> = mutableListOf<Foods>()
) {
    var payment = Payment(0.0);

    fun placeAnOrder(){
        println("-------- 🙋‍♂️ Realizando pedido --------");
        client.showInfo();
        company.showInfo();
        println("🍔 Comidas 🍔");
        foods.forEach { it.showInfo() }
        println("Preco total: " + getTotalPrice());
    }

    fun getTotalPrice(): Double{
        var totalPrice = 0.0;

        for(food in foods){
            totalPrice = totalPrice + food.price;
        }

        return totalPrice;
    }
}









