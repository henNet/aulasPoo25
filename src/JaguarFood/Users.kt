package JaguarFood

open class Users(
    var name: String,
    var email: String)
{
    open fun showInfo(){
        println("Nome: $name");
        println("Email: $email");
    }
}

class Client(
    name: String,
    email: String,
    val cpf: String) : Users(name, email)
{
    override fun showInfo() {
        super.showInfo();
        println("CPF: $cpf");
    }
}

class Company(
    name: String,
    email: String,
    val cnpj: String
) : Users(name, email) {
    override fun showInfo() {
        super.showInfo();
        println("CNPJ: $cnpj");
    }
}
















