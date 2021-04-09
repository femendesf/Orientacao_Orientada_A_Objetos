package one.digital.innovation.digionebank.teste

import one.digital.innovation.digionebank.Funcionario

class ImprimeRelatorioFuncionario { // Classe criada para poder chamar uma função de print organizada

    companion object{ //Metódo estatico que é possivel chamar via Classe e não instância
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}