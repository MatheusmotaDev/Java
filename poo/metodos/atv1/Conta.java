package poo.metodos.atv1;

import java.util.Scanner;



public class Conta {
    int numero_conta;
    double saldo;
    String status;
    boolean especial;
    double limite;

    Scanner sc = new Scanner(System.in);


    void sacar(){
        if(saldo >= 1){
            System.out.println("digite o valor para sacar: ");
            saldo -= sc.nextDouble();
            System.out.println("seu novo saldo é: " + saldo);
        } else{
            System.out.println("sua conta está zerada");
        }
    }

    void deposito(){
        System.out.println("digite o valor");
        saldo += sc.nextDouble();
        System.out.println("agora seu saldo é: " + saldo);
       
        
    }

    void consulta(){
        System.out.println("seu saldo atual é: " + saldo);
    }




    
}
