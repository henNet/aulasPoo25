package JaguarBank

class JaguarBank {
    val contas: MutableList<Conta>
    var agencia: Int
    var numero: Int

    //Inicializar os atributos
    //construtor secundario
    constructor(){
        contas = mutableListOf();
        agencia = 12
        numero  = 100
    }

    fun criarConta(titular: String){
        val contaNova: Conta

        if(numero == 100)
            contaNova= Conta(agencia, numero, titular, 100.0);
        else
            contaNova= Conta(agencia, numero, titular);

        contas.add(contaNova);
        numero++;
        println("Conta criada com sucesso!");
    }

    fun mostrarContas(){
        println("---- Contas do Jaguar Bank ----");
        for(conta in contas){
            conta.mostrarDados();
        }
    }

    fun pesquisarConta(numero: Int): Conta?{
        var contaBuscada: Conta? = null;

        for(conta in contas){
            if(numero == conta.numero)
            {
                contaBuscada = conta;
                break;
            }
        }

        return contaBuscada;
    }
}


