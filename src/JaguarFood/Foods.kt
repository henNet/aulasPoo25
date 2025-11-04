package JaguarFood

open class Foods(
    var name: String,
    var price: Double,
    var description: String
) {
    open fun showInfo() {
        println("Nome: $name")
        println("Price: $price")
        println("Descricao: $description")
    }

    fun Keven(){}
}

class Snack(
    name: String,
    price: Double,
    description: String,
    var category: String): Foods(name, price, description)
{
    override fun showInfo() {
        super.showInfo()
        println("Categoria: $category");
    }
}

class Drink(
    name: String,
    price: Double,
    description: String,
    var hasAlcool: Boolean) : Foods(name, price, description)
{
    override fun showInfo() {
        super.showInfo()
        if(hasAlcool)
            println("Bebida Alcoolica")
        else
            println("Bebida Não Alcoolica")
    }
}














