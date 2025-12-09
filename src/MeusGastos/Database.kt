package MeusGastos


import java.sql.Connection
import java.sql.DriverManager

object Database {
    private var urlConnect = "jdbc:postgresql://localhost:5432/meus-gastos"
    private var user = "postgres"
    private var password = "123"

    fun getConnection(): Connection {
        return DriverManager.getConnection(urlConnect, user, password);
    }
}