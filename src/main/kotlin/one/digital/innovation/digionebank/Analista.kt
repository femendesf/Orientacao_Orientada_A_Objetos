package one.digital.innovation.digionebank

class Analista ( // Como Analista é uma classe filha d e Funcionario, então tem que herdar todos os membros
    name: String,
    cpf: String,
    salario: Double

) : Funcionario(name, cpf, salario) {
    override fun calculoAuxilio() = salario * 0.1  // Obrigatório herdar a função calculoAuxilio, pq faz parte da classe mãe Funcionario

}