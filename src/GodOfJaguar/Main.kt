package GodOfJaguar

fun main(){
    var kratos: Personagem;
    /* Instanciando o Kratos */
    kratos = Personagem("Kratos da Silva", 100);
    var atreus = Personagem("Atreus da Silva");
    var thor = Personagem("Thor da Silva", level = 50);

    /* Inimigos */
    var bixoGelo = Inimigo("Bixo Gelo Sousa", "Gelo");
    var pebaFogo = Inimigo("Peba", "Fogo");

    var ares = Chefao("Ares da Fonseca", "Deus");
    var valkria = Chefao("Valkria de Jaguaruana", "Valkria");

    println("Ares: ${ares.poder}");
    println("Valkria: ${valkria.poder}");

    kratos.atacar("Machado Leviatan");
    atreus.atacar("Arco e flecha");
}