package poo.basico.aula6;

public class Carro {
    
    String marca;
    String modelo;
    int ano;
    double velocidade;

    public double acelerar(double acelerar){
        return velocidade += acelerar;
    }

    public double freiar(double freiar){
        return velocidade = 0;
    }

    void mostrarDados(){
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(ano);
        System.out.println(velocidade);
    }

    
}
    


