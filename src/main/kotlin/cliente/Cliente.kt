package cliente

open class Cliente(private var  nome: String,private var telefone: String,
              private var CPF: String,private var endereco: String) {


    private var rg = ""
    private var email = ""
    constructor( nome: String, telefone: String,CPF: String, endereco: String,rg:String, email:String
    ) :this(nome,telefone,CPF, endereco){
        this.rg = rg
        this.email = email
    }

    fun mostrar(cliente: Cliente){
        println(cliente.nome)
        println(cliente.telefone)
        println(cliente.CPF)
        println(cliente.endereco)
    }


}