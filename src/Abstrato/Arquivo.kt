package Abstrato

abstract class Arquivo(var nome: String?) {
    // Metodo abstrato
    abstract fun abrir()

    // Metodo concreto
    fun showInfo(){
        println("Nome do arquivo: $nome");
    }
}

class ArquivoTexto(nome: String?) : Arquivo(nome) {
    override fun abrir() {
        if(nome != null )
            println("Abrindo um arquivo de texto $nome");
    }
}

class ArquivoImagem(nome: String?) : Arquivo(nome) {
    override fun abrir() {
        println("Abrindo um arquivo de imagem $nome");
    }
}

fun main(){
    var texto = ArquivoTexto("atividades.txt")
    var imagem = ArquivoImagem("chamada.png")
    var imagem1 = ArquivoImagem(null)

    texto.abrir()
    texto.showInfo()

    imagem.abrir()
    imagem.showInfo()
}













