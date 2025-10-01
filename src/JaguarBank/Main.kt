package JaguarBank

fun main(){
    var jaguarBank = JaguarBank();
    var opcao: Int;

    do{
        /* TODO: Refatorar usando funcoes */
        println(" --- 😎 Bem vindos ao Jaguar Bank 😎 --- ")
        println("1. Criar conta");
        println("2. Listar contas");
        println("3. Acessar conta");
        println("0. Sair");

        print("Digite uma opcao: ");
        opcao = readln().toInt();

        when(opcao){
            1 -> {
                print("Digite o nome do titular: ")
                val nome = readln()
                jaguarBank.criarConta(nome);
            }

            2 -> {jaguarBank.mostrarContas()}

            3 -> {
                print("Digite o numero da conta: ");
                val numero = readln().toInt();

                val conta = jaguarBank.pesquisarConta(numero);

                if(conta == null){
                    println("Conta nao encontrada!");
                }else{
                    //SubMenu da opcao de Conta
                    var opcaoConta: Int
                    do{
                        println("-- 😁 Bem vindo ${conta.titular} 😁 --")
                        println("Saldo: ${conta.saldo}")
                        println("1 - Transferir")
                        println("0 - Sair")

                        print("Digite uma opcao: ")
                        opcaoConta = readln().toInt();

                        when(opcaoConta){
                            1 -> {
                                print("Digite o valor da transferencia: ");
                                val valor = readln().toDouble();

                                print("Digite o numero da conta destino: ");
                                val numeroDestino = readln().toInt();

                                val contaDestino = jaguarBank.pesquisarConta(numeroDestino);

                                if(contaDestino != null)
                                    conta.transferir(valor, contaDestino);
                            }
                        }
                    }while(opcaoConta != 0)
                }
            }
        }

    }while(opcao != 0);

}





