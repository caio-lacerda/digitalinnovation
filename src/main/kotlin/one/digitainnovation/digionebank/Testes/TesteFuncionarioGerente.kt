package one.digitainnovation.digionebank.Testes

import one.digitainnovation.digionebank.Analista
import one.digitainnovation.digionebank.Funcionario
import one.digitainnovation.digionebank.Gerente
import java.math.BigDecimal

    fun main() {

        val Marcos = Gerente("Marcos", "111.542.333-44",8000.0)
        ImprimeRelatorioFuncionario.imprime(Marcos)

    }

