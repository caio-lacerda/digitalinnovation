package one.digitainnovation.digionebank.Testes

import one.digitainnovation.digionebank.Analista
import one.digitainnovation.digionebank.Funcionario
import java.math.BigDecimal

    fun main() {

        val Joao = Analista("João", "111.222.333-44",2500.0)

        ImprimeRelatorioFuncionario.imprime(Joao)
    }

