package one.digital.innovation.digionebank.teste

import one.digital.innovation.digionebank.Gerente

fun main(){
    val felipe = Gerente("Felipe Mendes", "123.456.789-10", 8500.80, "senha123")
    ImprimeRelatorioFuncionario.imprime(felipe)

    TesteAutenticacao().autentica(felipe)
}
