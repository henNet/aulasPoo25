package Abstrato

interface Vehicle {
    fun acelerate()
    fun makeBreak()
}

class Car: Vehicle {
    override fun acelerate() {
        println("Acelerando ...")
    }

    override fun makeBreak() {
        println("Freando ...")
    }
}

fun main(){
    println("Questao veículo");

    var c = Car()
    c.acelerate()
    c.makeBreak()
}