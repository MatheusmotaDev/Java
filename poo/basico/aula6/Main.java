package poo.basico.aula6;

public class Main {
    public static void main(String[] args) {
        
        Carro fiat = new Carro();
        fiat.marca = "sinzero";
        fiat.modelo = "quart";
        fiat.ano = 2013;
        fiat.velocidade = 80;


        fiat.acelerar(30);
        System.out.println("voce acelerou!");
        System.out.println(fiat.velocidade);

        fiat.freiar(110);
        System.out.println("voce freou com tudo!");
        System.out.println(fiat.velocidade);
        

    }
}
