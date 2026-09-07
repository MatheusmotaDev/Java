package poo.basico.aula5;

public class Main {
    
    public static void main(String[] args) {
        
        Conta bradesco = new Conta();
        bradesco.titular = "Matheus";
        bradesco.saldo = 9000;

        Conta itau = new Conta();
        itau.titular = "Rafael";
        itau.saldo = 20000;

        bradesco.mostrarSaldo();
        itau.mostrarSaldo();
    }
}
