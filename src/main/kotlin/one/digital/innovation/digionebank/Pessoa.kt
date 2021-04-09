package one.digital.innovation.digionebank

abstract class Pessoa( // Classe abstrata não instância
     val name: String,
     val cpf: String
)
    // private set // Privando apenas o set da variavel cpf
    // 'name' e 'cpf' são os membros das classes



    //inner class Endereco( // Classe interna da classe Pessoa
        //var rua: String = "Rua Radialista Souza Moreno"


    //constructor(name: String, cpf: String) // Contrutor secundario
    //fun pessoaInfo() = "$name e $cpf" // Função permite objetos terem comportamentos

