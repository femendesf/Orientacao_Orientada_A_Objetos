package one.digital.innovation.digionebank.teste

import one.digital.innovation.digionebank.Analista
import one.digital.innovation.digionebank.Funcionario


fun main(){
    val gabrielle = Analista("Gabrielle Conor", "109.876.543-21", 3500.80)
    ImprimeRelatorioFuncionario.imprime(gabrielle)
}
