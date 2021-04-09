package one.digital.innovation.digionebank.teste

import one.digital.innovation.digionebank.Funcionario
import one.digital.innovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    val gabrielle = Pessoa(name = "Gabrielle",  cpf = "109.876.543-21")
    println(gabrielle.name)
    println(gabrielle.cpf)

    val fatima = Funcionario("Fatima", "021.478.422-20", BigDecimal.valueOf(2550.80))
    println(fatima.name)
    println(fatima.cpf)
    println(fatima.salario)
}