package MeusGastos

fun main(){
    println("Aplicação Meus Gastos");

    var me = MyExpenses()

    println("Antes ...")
    me.showExpenses();

//    println("Depois ...")
//    me.insertExpense(
//        "Luz",
//        60.00
//    );
//    me.showExpenses()

//    me.deleteExpense(1)
//    me.showExpenses()

    me.updateExpense(5, "Luz Fortaleza", 250.00);
    me.showExpenses()
}