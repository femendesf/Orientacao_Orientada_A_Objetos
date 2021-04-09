package one.digital.innovation.digionebank

class Pessoa {
    var name:String = "Felipe"

    var cpf: String = "123.456.789-10"
    private set // Privando apenas o set da variavel cpf
    // 'name' e 'cpf' são os membros das classes



    inner class Endereco( // Classe interna da classe Pessoa
        var rua: String = "Rua Radialista Souza Moreno"
    )

    constructor() // Contrutor secundario
    fun pessoaInfo() = "$name e $cpf" // Função permite objetos terem comportamentos
}
fun main() {
    val cliente = Pessoa()


    println(cliente.name)
    println(cliente.cpf)
    println(cliente.Endereco().rua)
    println("*******************************")
    println(cliente.pessoaInfo())

}