package Revisao2

class Loja {
    private var itens = mutableListOf<String>()

    fun adicionaritem(item: String){
        itens.add(item);
    }

    fun removerItem(item: String){
        itens.remove(item);
    }

    fun listarItem(){
        itens.forEach{println(it)}

//        for(i in itens){
//            println(i);
//        }
    }
}