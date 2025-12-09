package Abstrato

abstract class FinancialTransactions(var balance: Double) {
    abstract fun process(valor: Double)

    fun details(){
        println("Saldo atual: $balance");
    }
}

class Deposit(balance: Double) : FinancialTransactions(balance) {
    override fun process(valor: Double) {
        println("Realizando um depósito");
        super.balance += valor;
        super.details();
    }
}

class Withdraw(balance: Double) : FinancialTransactions(balance){
    override fun process(valor: Double) {
        println("Realizando um Saque");
        if(super.balance >= 0 && super.balance >= valor){
            super.balance -= valor;
        }else{
            println("Saldo Insuficiente!")
        }
        super.details();
    }
}

fun main(){
    println("Transacao financeira");
    var deposit = Deposit(500.00);
    deposit.process(50.00);

    var s = Withdraw(100.00);
    s.process(20.00)
}