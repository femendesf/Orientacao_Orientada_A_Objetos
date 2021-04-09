package one.digital.innovation.digionebank

class Gerente(
    name: String,
    cpf: String,
    salario: Double

)
    : Funcionario(name, cpf, salario) {
    override fun calculoAuxilio(): Double = salario * 0.4
    }
