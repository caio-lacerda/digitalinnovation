package one.digitainnovation.digionebank.Testes

import one.digitainnovation.digionebank.Banco

fun main() {
    val digiOneBank = Banco(nome = "DigiOne", numero = 12 )

    println(digiOneBank.bancoInfo())

}