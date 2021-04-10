package one.digital.innovation.digionebank.teste

import one.digital.innovation.digionebank.Cliente
import one.digital.innovation.digionebank.ClienteTipo

fun main() {
    val steve = Cliente(name = "Steve Jobs", cpf = "458.211.879-03",clienteTipo = ClienteTipo.PF,senha = "123456")
    TesteAutenticacao().autentica(steve)
}