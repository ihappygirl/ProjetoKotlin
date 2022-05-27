package Compra/*
    na nossa classe, temos 4 métodos
    - adicionar produtos a lista
    - listar produtos da lista
    - editar produtos da lista
    - remover produtos da lista
     */

class Compra {

    var lista = mutableListOf<String>()

    fun adicionar(){

        var sair = ""

        while (true){
            println("\nAdicionar")
            print("Digite o item para adicionar na lista: ")
            val valor = readln()

            if (valor != "") {
                lista.add(valor)
                println("Adicionado!")
                print("Digite sair para retornar ao menu ou tecle enter para adicionar novamente: ")
                sair = readln()
                if (sair == "sair"){
                    break
                }
            }else{
                print("Digite sair para retornar ao menu ou tecle enter para editar novamente: ")
                sair = readln()
                if (sair == "sair"){
                    break
                }
            }
        }

    }

    fun listar(){

        var sair = ""
        val aux = lista.isEmpty().toString()

        if (sair != "sair"){
            if (aux == "true"){
                println("A lista está vazia!")
            }else{
                println("\nLista:")
                print(lista.joinToString("\n"))
                println()
            }
        }

        print("Para retornar ao menu digite 'sair': ")
        sair = readln()

    }

}