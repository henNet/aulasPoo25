package JaguarFit

class JaguarFit {
    private val alunos = mutableListOf<Aluno>()
    private val instrutores = mutableListOf<Instrutor>()

    fun adicionarAluno(aluno: Aluno){
        alunos.add(aluno);
    }

    fun adicionarInstrutor(instrutor: Instrutor){
        instrutores.add(instrutor);
    }

    fun listarAlunos(){
        println("-- Alunos da JaguarFit --");
        alunos.forEach {it.mostrarDados()}
    }

    fun buscarAluno(id: Int): Aluno?{
       return alunos.find{it.pegarId() == id}
    }

    fun listarInstrutores(){
        println("-- Instrutores da JaguarFit --");
        instrutores.forEach {it.mostrarDados()}
    }

    fun buscarInstrutor(id: Int): Instrutor?{
        return instrutores.find{it.pegarId() == id}
    }
}