package estabelecimento

import cliente.Cliente

open class Estabelecimento(private val nome: String, private val endereco: String, private val CNPJ: String) {

    companion object {
        var estab = Estabelecimento(nome = "", endereco = "", CNPJ = "")

        fun cadastroEstab(): Estabelecimento {
            print("Digite seu nome: ")
            var nome = readln()
            print("Digite seu endereco: ")
            var endereco = readln()
            print("Digite seu CNPJ: ")
            var cnpj = readln()

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
