package one.digitainnovation.digionebank.Testes

import one.digitainnovation.digionebank.ClienteTipo

fun main() {
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} - ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("${it.name} - ${it.descricao}")                     //Este modo funciona igual o de cima, mas é mais usualmente utiizado - a própria IDE já reconhece o elemento da classe ClienteTipo

    }
}