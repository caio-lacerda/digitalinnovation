package one.digitainnovation.digionebank

class Pessoa {

        var nome:String = "Caio"

        var cpf:String = "111.222.333-11"
            private set //alterou o comportamento da variável

        constructor()

    }

    fun main(){

        val user = Pessoa()
        println(user.nome)
        println(user.cpf)


    }
