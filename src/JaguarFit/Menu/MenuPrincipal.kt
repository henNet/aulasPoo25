package JaguarFit.Menu

import JaguarFit.JaguarFit

class MenuPrincipal(var jaguarFit: JaguarFit) {
    val menuAluno = MenuAluno()
    val menuInstrutor = MenuInstrutor()

    fun mostrarMenu(){
        do {
            println("=== Bem vindos a Jaguar Fit ===")
            println("1. Acesso Aluno")
            println("2. Acesso Instrutor")

            println("0. Sair")
            print("Escolha uma opção: ");
            var opcao = readln().toInt()

            when(opcao){
                1 -> {menuAluno.mostrarMenu(jaguarFit)}
                2 -> {menuInstrutor.mostrarMenu()}
            }
        }while(opcao != 0 )
    }
}