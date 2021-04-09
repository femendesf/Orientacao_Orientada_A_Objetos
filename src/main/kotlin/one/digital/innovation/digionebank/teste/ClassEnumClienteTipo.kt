package one.digital.innovation.digionebank.teste

import one.digital.innovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach {
        println("${it} - ${it.description}")

    }
}