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

    fun insertExpense(description: String, value: Double){
        val sql =
            "insert into expenses(description, value) values(?, ?)"

        try{
            val conn = Database.getConnection();
            val query = conn.prepareStatement(sql);

            query.setString(1, description);
            query.setDouble(2, value);

            query.executeUpdate();

        }catch(e: Exception){
            println("Deu erro: ${e.toString()}")
        }
    }

    fun deleteExpense(id: Int){
        val sql =
            "delete from expenses where id = ?"

        try{
            val conn = Database.getConnection();
            val query = conn.prepareStatement(sql);

            query.setInt(1, id);

            println("Status: ${query.executeUpdate()}");

        }catch(e: Exception){
            println("Deu erro: ${e.toString()}")
        }
    }

    fun updateExpense(id: Int, description: String, value: Double){
        val sql =
            "update expenses set description = ?, value = ? where id = ?;"

        try{
            val conn = Database.getConnection();
            val query = conn.prepareStatement(sql);

            query.setString(1, description);
            query.setDouble(2, value);
            query.setInt(3, id);

            println("Status: ${query.executeUpdate()}");

        }catch(e: Exception){
            println("Deu erro: ${e.toString()}")
        }
    }
}










