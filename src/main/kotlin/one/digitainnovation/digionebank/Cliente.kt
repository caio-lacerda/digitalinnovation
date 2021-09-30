package one.digitainnovation.digionebank

class Cliente (
    nome: String,
    cpf: String,
    val ClienteTipo: ClienteTipo,
    val senha: String) : Pessoa(nome, cpf), Logavel {
    override fun login(): Boolean = "1234" == senha

    override fun toString(): String = """
    Nome: $nome
    Cpf: $cpf
    Tipo de Cliente: ${ClienteTipo.descricao}
    
    
""".trimIndent()
}
