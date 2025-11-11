package Revisao3

open class Server(var name: String) {
    open fun Welcome(){
        println("Boas vindas Servidor $name");
    }
}

class Teacher(name: String, var college: String) : Server(name){
    override fun Welcome() {
        super.Welcome()
        println("Voce trabalha em $college");
    }
}

fun main(){
    var teacher1 = Teacher("Henrique Neto", "IFCE");
    teacher1.Welcome();
}