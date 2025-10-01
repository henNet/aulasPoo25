package JaguarFit

class Instrutor(
    private var id: Int,
    private var nome: String
) {
    fun pegarId() = id;

    fun mostrarDados() = println("Nome: ${nome}");

    fun criarTreino(descricao: String, qtMin: Int): Treino {
        println("Treino criado pelo instrutor ${nome}")
        return Treino(descricao, qtMin);
    }

    fun adicionarTreinoParaAluno(treino: Treino, aluno: Aluno){
        aluno.adicionarTreino(treino);
    }
}