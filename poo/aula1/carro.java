package poo.aula1;

public class carro {
    
    String nome;
    String modelo;
    int vel;
    double preco;

    void acelerar(int aceleracao){
        vel+=aceleracao;
    }

    void freiar(int reduzir){
        vel-=reduzir;
    }

    void buzinar(){
        System.out.println("beebbeiip!!");
        
    }

    
}

