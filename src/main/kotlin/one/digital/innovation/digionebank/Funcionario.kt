package one.digital.innovation.digionebank

import java.math.BigDecimal

class Funcionario(
    name: String,
    cpf: String,
    val salario: BigDecimal

    ) : Pessoa(name, cpf){

    }