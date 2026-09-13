package poo.associacao.atv2;

public class Carro {
    String modelo;
    Motor motor;

    void mostrar(){
        System.out.println("você comprou o carro do modelo: " + modelo + " com a marca do motor " + motor.marca + " com " + motor.potencia + " cavalos de potencia");
    }
}
