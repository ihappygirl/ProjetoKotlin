package cliente

open class Cliente(
    private var nome: String,
    private var telefone: String,
    private var CPF: String,
    private var endereco: String
) {

    companion object {
        var cliente = Cliente(nome = "", telefone = "", CPF = "", endereco = "")

        fun cadastroCliente(): Cliente {

            print("Digite seu nome: ")
            var nome = readln()
            print("Digite seu telefone: ")
            var tel = readln()
            print("Digite seu CPF: ")
            var cpf = readln()
            print("Digite seu endereco: ")
            var endereco = readln()

            cliente = Cliente(nome = nome, telefone = tel, CPF = cpf, endereco = endereco)

            return cliente
        }

        fun mostra() {
            println(cliente.nome)
            println(cliente.telefone)
            println(cliente.endereco)
            println(cliente.CPF)
        }
    }
}