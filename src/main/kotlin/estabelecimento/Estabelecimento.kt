package estabelecimento

import cliente.Cliente

open class Estabelecimento (private val nome: String,private val endereco: String, private val CNPJ: String){


    fun mostrar(estabelecimento: Estabelecimento) {
        println(estabelecimento.nome)
        println(estabelecimento.endereco)
        println(estabelecimento.CNPJ)
    }
}
