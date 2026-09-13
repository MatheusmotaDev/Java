package poo.associacao.atv2;

public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Motor f = new Motor();
        c1.modelo = "fiat";
        f.marca = "lala";
        f.potencia = 500;
        c1.motor =(f);

        c1.mostrar();

        
    }
}
