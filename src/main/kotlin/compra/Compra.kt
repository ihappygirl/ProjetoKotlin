package compra

import cliente.Cliente

/*
    na nossa classe, temos 4 métodos
    - adicionar produtos a lista
    - listar produtos da lista
    - editar produtos da lista
    - remover produtos da lista
*/

class Compra(nome: String, telefone: String, cpf: String, endereco: String): Cliente(nome, telefone, cpf, endereco){
    companion object{
        private var lista = mutableListOf<String>()

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

        fun editar(){
            // checar primeiro se a lista tá vazia
            if (lista.isEmpty()){
                println("Não existem produtos na lista.")
            } else {
                while(true){
                    print("Digite um produto para editar: ")
                    val nomeProd = readln()

                    if (lista.contains(nomeProd)) {
                        val index = lista.indexOf(nomeProd)

                        print("Digite o novo nome do produto: ")
                        val novoNomeProd = readln()

                        lista[index] = novoNomeProd
                        println("$nomeProd foi editado com sucesso!")

                        break
                    } else {
                        println("O produto $nomeProd não existe na lista.")
                    }
                }
            }
        }

        fun remover(){
            // checar primeiro se a lista tá vazia
            if (lista.isEmpty()){
                println("Não existem produtos na lista.")
            } else {
                while(true){
                    print("Digite um produto para deletar da lista: ")
                    val nomeProd = readln()

                    if(lista.contains(nomeProd) && nomeProd != ""){
                        lista.remove(nomeProd)
                        println("$nomeProd deletado com sucesso!")
                        break
                    }else {
                        println("O produto $nomeProd não existe na lista.")
                    }
                }
            }

        }

    }


}