package estabelecimento

import cliente.Cliente

open class Estabelecimento(private val nome: String, private val endereco: String, private val CNPJ: String) {

    companion object {
        var estab = Estabelecimento(nome = "", endereco = "", CNPJ = "")

        fun cadastroEstab(): Estabelecimento {
            print("Digite o nome do estabelecimento: ")
            val nome = readln()
            print("Digite o endereco do estabelecimento: ")
            val endereco = readln()
            print("Digite o CNPJ do estabelecimento: ")
            val cnpj = readln()

            estab = Estabelecimento(nome = nome, endereco = endereco, CNPJ = cnpj)

            return estab
        }

        fun mostrar(){
            println(estab.nome)
            println(estab.endereco)
            println(estab.CNPJ)
        }
    }
}
