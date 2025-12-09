package Database
import java.sql.DriverManager

fun main(){
    println("Trabalhando com banco de dados");

    /* Conexao com o banco */
    var urlConnect = "jdbc:postgresql://localhost:5432/ifce-jga"
    var connect = DriverManager.getConnection(urlConnect, "postgres", "123");

    /* Preparando a query */
    var sql = "select * from students";
    var query = connect.prepareStatement(sql);

    var result = query.executeQuery();

    while(result.next()){
        var name = result.getString("name");
        var age = result.getString("age");

        println("Nome: $name - Idade: $age");
    }
}