package MeusGastos

class Expense(
    var id: Int,
    var description: String,
    var value: Double
){
    fun showInfo(){
        println("Id: ${id} - Descricao: ${description} - Valor: ${value}");
    }
}

class MyExpenses {
    fun showExpenses(){
        var sql = "select id, description, value from expenses"

        try {
            var conn = Database.getConnection();
            var query = conn.prepareStatement(sql);
            var result = query.executeQuery();

            while (result.next()) {
                var ex = Expense(
                    result.getInt("id"),
                    result.getString("description"),
                    result.getDouble("value")
                )

                ex.showInfo()
            }
        }catch(e: Exception){ println("Deu erro: ${e.toString()}")}
    }

    fun insertExpense(){

    }
}