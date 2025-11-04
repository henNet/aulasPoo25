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

    user1.showInfo();
    company1.showInfo();
    snack1.showInfo();
}