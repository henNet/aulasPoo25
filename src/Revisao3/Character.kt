package Revisao3

import Revisao2.Persona

open class Character(var name: String) {
    open fun attack(){
        println("Ataque genérico");
    }
}

class Warrior(name: String, var swordDamage: Int) : Character(name) {
    override fun attack() {
        println("Atacando com a ESPADA ...");
    }
}

class Archer(name: String, var arcDamage: Int) : Character(name) {
    override fun attack() {
        println("Atacando com as FLECHAS ...");
    }
}

fun main(){
    var persona = Character("");

    println("Seleção de Personagens: ")
    println("1 - Guerreiro")
    println("2 - Arqueiro")
    print("Escolha uma opção: ")
    val option = readln().toInt();

    print("Escolha um nome para o personagem: ");
    val name = readln();

    when(option){
        1 -> persona = Warrior(name, 10)
        2 -> persona = Archer(name, 10)
        else -> persona = Character(name)
    }

    persona.attack();
}