package one.digital.innovation.digionebank.teste

import one.digital.innovation.digionebank.Analista
import one.digital.innovation.digionebank.Funcionario

fun main(){
    val felipe = Analista("Felipe Mendes", "123.456.789-10", 8500.80)
    ImprimeRelatorioFuncionario.imprime(felipe)

}
