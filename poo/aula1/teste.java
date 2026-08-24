package poo.aula1;

public class teste {
    
    public static void main(String[] args) {
        carro c1 = new carro();

        c1.nome = "palio";
        c1.modelo = "seilakk";
        c1.preco = 59.000;
        c1.vel = 80;

        c1.acelerar(10);
        System.out.println("você começou a acelerar!!");
        System.out.println("alerta de velocidade!! " + c1.vel + "km por hora");

        c1.freiar(30);
        System.out.println("vocÊ freou muito!!");
        System.out.println("velocidade atual: " + c1.vel + "km por hora");
    }
}
