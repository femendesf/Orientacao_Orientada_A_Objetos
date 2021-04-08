package one.digital.innovation.digionebank

class Pessoa {
    var name:String = "Felipe"
    var cpf: String = "123.456.789-10"
}
fun main() {
    val cliente = Pessoa()

    println(cliente.name)
    println(cliente.cpf)
}