package one.digitainnovation.digionebank.Testes

import jdk.incubator.vector.VectorOperators
import one.digitainnovation.digionebank.Cliente
import one.digitainnovation.digionebank.ClienteTipo

fun main () {
    val Jose = Cliente(
        nome = "José Silva",
        cpf = "123.456.789-00",
        ClienteTipo = ClienteTipo.PF,
        senha = "1234")

    println(Jose)

    TesteAutenticacao().autentica(Jose)

}