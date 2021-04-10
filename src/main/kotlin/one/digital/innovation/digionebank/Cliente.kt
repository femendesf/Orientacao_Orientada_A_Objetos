package one.digital.innovation.digionebank

import com.sun.org.apache.xpath.internal.operations.Bool

class Cliente(
    name: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String

): Pessoa(name, cpf,), Logavel{
    override fun login(): Boolean = "123456" == senha

    override fun toString(): String = """
        NOME: $name
        CPF: $cpf
        Tipo de Cliente: ${clienteTipo.description}
    """.trimIndent()
}
