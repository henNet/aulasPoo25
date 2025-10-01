package JaguarFit

private class Historico(
    var level: Int = 0,
    var tempo: Int = 0)

class Aluno(
    private var id: Int,
    private var nome: String,
    private var plano: Plano
    )
{
    private var historico = Historico()
    private val treinos = mutableListOf<Treino>();

    fun pegarId(): Int{
        return id;
    }

    fun mostrarDados(){
//        println("---- Dados do Aluno ----");
        println("Nome: ${nome}");
//        plano.mostrarPlano();
    }

    fun adicionarTreino(treino: Treino){
        treinos.add(treino)
    }

    fun mostrarTreinos(){
        if(treinos.isEmpty()){
            println("O aluno ${nome} nao possui nenhum treino");
        }else{
            println("-- Treinos do aluno ${nome}")
//            for(treino in treinos){
//                treino.mostrarTreino()
//            }
            treinos.forEach {it.mostrarTreino()}
        }
    }
}