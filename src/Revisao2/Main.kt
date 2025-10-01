package Revisao2

fun main(){
    println("Revisao - Prova 2")
    /* Questao 1 */
//    var hollowKnight = Persona();
//
//    hollowKnight.receberDano(1000)
//    hollowKnight.receberCura(10);

    /* Questao 3 */
//    var jaguarBox = Loja();
//    jaguarBox.adicionaritem("Cafe")
//    jaguarBox.adicionaritem("Biscoito")
//    jaguarBox.adicionaritem("Pão")
//
//    jaguarBox.listarItem();
//
//    jaguarBox.removerItem("Biscoito");
//
//    jaguarBox.listarItem()

    /* Questao 5 */
    var missao1 = Missao("Coletar as pulgas");
    var missao2 = Missao("Trem do GTA San Andreas");
    var missao3 = Missao("Matar o nemesis");

    missao1.concluir();
    missao2.concluir();
    missao3.concluir();

    Missao.mostrarPontoTotais();














}