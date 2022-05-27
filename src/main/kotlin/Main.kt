import cliente.Cliente
import compra.Compra
import estabelecimento.Estabelecimento
import produto.Produto

//<<<<<<< HEAD
fun main() {

    var sair: String

    while (true){

        println("\n    MENU   \n")
        print("'1' - Cadastro estabelecimento\n" +
                "'2' - Cadastro cliente\n" +
                "'3' - Sair\n"+

                "Digite a opção desejada: ")
        val op = readln().toInt()

        when(op){
            1 -> {
                Estabelecimento.mostrar()
                Estabelecimento.cadastroEstab()
                Estabelecimento.mostrar()

              do {
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

              } while (true)
            }

            2 -> {
                Cliente.mostra()
                Cliente.cadastroCliente()
                Cliente.mostra()

                do {
                    println("\n    MENU   \n")
                    print("'1' - Ver os dados da lista\n" +
                            "'2' - Adicionar dados na lista\n" +
                            "'3' - Editar dados da lista\n" +
                            "'4' - Remover dados da lista\n" +
                            "'5' - Sair\n" +
                            "Digite a opção desejada: ")
                    when(readln().toInt()){

                        1 -> Compra.listar()
                        2 ->{
                            Produto.mostraProd()
                            Compra.adicionar()
                        }
                        3 -> Compra.editar()
                        4 -> Compra.remover()
                        5 -> break

                    }

                }while (true)

            }

            3 -> break

        }

    }

}