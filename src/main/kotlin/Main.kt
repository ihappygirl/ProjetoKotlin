import produto.Produto

fun main() {
    val prod = Produto()

    prod.cadastroProd()
    prod.mostraProd()
    println("------------------------")
    prod.editarProd()
    prod.mostraProd()
    println("------------------------")
    prod.removerProd()
    prod.mostraProd()
    println("------------------------")
}