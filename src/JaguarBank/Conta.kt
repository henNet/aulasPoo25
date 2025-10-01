package JaguarBank

class Conta(
    var agencia: Int,
    var numero: Int,
    var titular: String,
    var saldo: Double = 0.0)
{
    fun mostrarDados(){
        println("------------------")
        println("Numero: $numero")
        println("Titular: $titular")
        println("Saldo: $saldo")
        println("------------------")
    }

    fun depositar(valor: Double){
        if(valor > 0) {
            saldo += valor;
            println("Depositado R$ $valor com sucesso! 😁");
        }else{
            println("Valor invalido");
        }
    }

    fun sacar(valor: Double){
        if(valor > 0 && valor <= saldo)
        {
            saldo -= valor //saldo = saldo - valor
            println("Saque de R$ $valor com sucesso! 😥");
        }else{
            println("Saldo insuficiente ou valor inválido.");
        }
    }

    fun transferir(valor: Double, contaDestino: Conta) {
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            contaDestino.depositar(valor);
            println("Jix de R$ $valor enviado para ${contaDestino.titular}");
        }else{
            println("Saldo insuficiente ou valor inválido.");
        }
    }
}