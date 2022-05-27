import cliente.Cliente
import compra.Compra
import estabelecimento.Estabelecimento
import produto.Produto

//<<<<<<< HEAD
fun main() {

    var sair: String

    while (true){

        println("\n    MENU   \n")
        print("'1' - Cadastro cliente\n" +
                "'2' - Cadastro estabelecimento\n" +
                "'3' - Sair\n"+

                "Digite a opção desejada: ")
        val op = readln().toInt()

        when(op){

            1 -> {
                print("Digite seu nome: ")
                var nome = readln()
                print("Digite seu telefone: ")
                var tel = readln()
                print("Digite seu CPF: ")
                var cpf = readln()
                print("Digite seu endereco: ")
                var endereco = readln()

                var cliente = Cliente(nome, tel, cpf, endereco)

                println("\n    MENU   \n")
                print("'1' - Ver os dados da lista\n" +
                        "'2' - Adicionar dados na lista\n" +
                        "'3' - Editar dados da lista\n" +
                        "'4' - Remover dados da lista\n" +
                        "'5' - Sair\n" +
                        "Digite a opção desejada: ")
                when(readln().toInt()){

                    1 -> Compra.listar()
                    2 -> Compra.adicionar()
                    3 -> Compra.editar()
                    4 -> Compra.remover()
                    5 -> break

                }

            }

            2 -> {
                print("Digite seu nome: ")
                var nome = readln()
                print("Digite seu endereco: ")
                var endereco = readln()
                print("Digite seu CNPJ: ")
                var cnpj = readln()

                val estabelecimento = Estabelecimento(nome, endereco, cnpj)

                println("\n    MENU   \n")
                print("'1' - Cadastrar produto\n" +
                        "'2' - Remover produto\n" +
                        "'3' - Editar produto\n" +
                        "'4' - Ver lista\n" +
                        "'5' - Sair\n" +
                        "Digite a opção desejada: ")
                    when(readln().toInt()){

                        1 -> Produto.cadastroProd()
                        2 -> Produto.removerProd()
                        3 -> Produto.editarProd()
                        4 -> Produto.mostraProd()
                        5 -> break

                    }
            }

            3 -> break

        }

    }

}