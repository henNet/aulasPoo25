package JaguarFood

fun main(){
    println("🍔 Bem vindos ao JaguarFood 🍔")

    var user1 = Client("Keven",
        "keven@gmail.com",
        "123");

    var company1 = Company("Brownies",
        "ana@gmail.com",
        "456");

    var snack1 = Snack("Pizza", 45.00,
        "Pizza de frango com catupiry", "Salgados")

    var drink1 = Drink(
        "Suco",
        8.00,
        "Suco de Laranja",
        false);

    var order1 = Order(
        user1,
        company1,
        mutableListOf(snack1, drink1)
    )

    order1.placeAnOrder();
}