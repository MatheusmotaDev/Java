package poo.metodos.atv1;

public class Main {
    
    public static void main(String[] args) {
        
        Conta bradesco = new Conta();
        bradesco.numero_conta = 145556;
        bradesco.saldo = 0;

        bradesco.consulta();


        bradesco.sacar();
        


    }
}
