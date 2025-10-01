package JaguarFit

import JaguarFit.Menu.MenuPrincipal

fun main(){
    println("-- Bem vindo ao JaguarFIt --")

    var plano1 = Plano("Basico", 50.00, 3);
    var plano2 = Plano("Vip", 75.00, 5);
    var plano3 = Plano("Premium", 95.00, 7);

    plano1.mostrarPlano()

    var marcelo = Aluno(1, "Marcelo da Silva", plano1)
    var alcindo = Aluno(2, "Alcindo da Silva", plano2)
    var elias = Aluno(3, "Elias da Silva", plano3)

    marcelo.mostrarDados()

    var treino1 = Treino("Crucifixo no banco com halteres", 2);
    treino1.mostrarTreino();

    var genivaldo = Instrutor(111, "Genivaldo Neto");
    var treinoPernas = genivaldo.criarTreino("Leg Press", 5);
    var treinoCostas = genivaldo.criarTreino("Remada baixa", 6);
    var treinoPeito = genivaldo.criarTreino("Cross over", 5);

    genivaldo.adicionarTreinoParaAluno(treinoPernas, marcelo)
    genivaldo.adicionarTreinoParaAluno(treinoPeito, marcelo)
    genivaldo.adicionarTreinoParaAluno(treinoPeito, alcindo)
    genivaldo.adicionarTreinoParaAluno(treinoCostas,elias)

    marcelo.mostrarTreinos()
    alcindo.mostrarTreinos()
    elias.mostrarTreinos()

    var jaguarFit = JaguarFit();
    jaguarFit.adicionarAluno(elias)
    jaguarFit.adicionarAluno(marcelo)
    jaguarFit.adicionarAluno(alcindo)

    jaguarFit.listarAlunos();

    val menu = MenuPrincipal(jaguarFit)
    menu.mostrarMenu();
}







