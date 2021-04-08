package one.digital.innovation.digionebank

class Pessoa {
    var name:String = "Felipe"

    var cpf: String = "123.456.789-10"


    inner class Endereco( // Classe interna da classe Pessoa
        var rua: String = "Rua Radialista Souza Moreno"
    )
}
fun main() {
    val cliente = Pessoa()

    cliente.cpf = "1234"
    println(cliente.name)
    println(cliente.cpf)
    println(cliente.Endereco().rua)
}