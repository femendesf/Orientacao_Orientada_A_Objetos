package one.digital.innovation.digionebank

abstract class  Funcionario(
    name: String,
    cpf: String,
    val salario: Double

    ) : Pessoa(name, cpf){
        protected abstract fun calculoAuxilio(): Double; // Apenas as Class Funcionario e as classe filhas vão poder usar essa classe

        override fun toString(): String ="""
                Nome: $name
                CPF: $cpf
                Salário: $salario
                Auxilio: ${calculoAuxilio()}
            """.trimIndent()
    }