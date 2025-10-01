package Encapsulamento

class Pessoa {
    var nome: String? = "Desconhecido"
        set(value){
            if(value.isNullOrBlank())
                field = value;
            else
                println("Nome invalido!");
        }
        get(){
            return field?.replaceFirstChar { it.uppercase() }
        }

    var idade = 0
        private set

    fun fazerAniversario()
    {
        idade++;
    }
}