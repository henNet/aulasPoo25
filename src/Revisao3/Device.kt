package Revisao3

open class Device(var brand: String, var model: String) {
    open fun showInfo(){
        println("Marca: $brand - Modelo: $model")
    }
}

class Cellphone : Device {
    var operationalSystem: String

    constructor(brand: String, model: String, os: String) : super(brand, model){
        this.operationalSystem = os;
    }

    override fun showInfo() {
        super.showInfo()
        println("OS: $operationalSystem");
    }
}

fun main(){
    var cell = Cellphone("Samsung", "S10e", "Android 18");
    cell.showInfo();
}