package Heranca

open class Vehicle {
    var mark = "";

    constructor(mark: String){
        this.mark = mark;
    }

    open fun openLights(){
        println("Ligando as luzes ...");
    }

    fun showInfo(){
        println("Marca: $mark");
    }
}

class Bike(mark: String) : Vehicle(mark)

class Car : Vehicle {
    private var engineOn: Boolean = false

    constructor(mark:String) : super(mark)

    fun turnOnEngine(){
        println("Ligando o motor ...");
        engineOn = true;
    }

    override fun openLights() {
        if(engineOn == true)
            super.openLights();
        else
            println("Carro desligado ...")
    }
}

fun main(){
    println("Estudando Herança ...");

    var bike = Bike("Caloi")
//    bike.mark = "Caloi";
    bike.openLights();
    bike.showInfo();

    var car = Car("Hyndai");
    car.mark = "Hyundai";
    car.openLights();
    car.turnOnEngine()
    car.openLights()
    car.showInfo();
}