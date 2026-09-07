package poo.basico.aula2;

public class produto {
    
    String nome;
    String marca;
    double preco;

    
    produto(){

    };

    produto(String nome){
        this.nome = nome;
    }

    produto(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    produto(String nome, String marca, double preco){
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

}
