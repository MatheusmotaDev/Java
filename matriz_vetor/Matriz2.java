package matriz_vetor;

import java.util.Scanner;

public class Matriz2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        double [] transacoes = new double[5];

        double saldototal = 0;

        for(int i = 0; i < transacoes.length; i++){
            transacoes[i] = sc.nextDouble();
        }

        for(int i = 0; i < transacoes.length; i++){
            System.out.println(transacoes[i]);
            saldototal = saldototal + transacoes[i];
        }

        System.out.println("Saldo final = " + saldototal);


    }

}   



