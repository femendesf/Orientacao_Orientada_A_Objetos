package one.digital.innovation.digionebank.teste

import one.digital.innovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(number = 10, name = "DigiOne") // Com Kotlin pode usar a variavel com o nome pra poder atribuir algum dado
    // Se definir Banco(number: 10, name "Digione") vai dar erro, pois você vai estar atribuindo conforme a sequencia do construtor

    println(digiOneBank.name)
    println(digiOneBank.number)

    val banco2 = digiOneBank.copy(name = "TESTE")
    println(banco2.info())
}