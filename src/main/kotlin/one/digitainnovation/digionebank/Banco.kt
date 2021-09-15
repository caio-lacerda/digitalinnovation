package one.digitainnovation.digionebank

data class Banco(
    val nome:String,
    val numero:Int
) {
    fun bancoInfo() = "$nome" + " $numero"
}
