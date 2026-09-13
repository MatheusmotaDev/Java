package poo.associacao.atv1;

public class Pessoa {
    String nome;
    Endereco endereco;


    void visualizar(){
        System.out.println("o nome da pessoa é " + nome + " e a pessoa mora na rua " + endereco.rua + " e na cidade de: " + endereco.cidade);
    }
}


