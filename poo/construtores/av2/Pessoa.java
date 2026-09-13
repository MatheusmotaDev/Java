package poo.construtores.av2;

public class Pessoa {
    String nome;
    int idade;

    Pessoa(){

    }

    Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    void apresentar(){
        System.out.println("oi " + this.nome + " tudo bem com você? verifiquei que você tem  " + this.idade + " anos, uau!");
    }

}
