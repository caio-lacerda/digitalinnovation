package one.digitainnovation.digionebank

abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double

        ) :Pessoa(nome,cpf) {
            protected abstract fun calculoAuxilio(): Double

   override fun toString(): String = """
    Nome: $nome
    Cpf: $cpf
    Salario:R$ $salario
    Auxílio:R$ ${calculoAuxilio()}
    
""".trimIndent()

}
