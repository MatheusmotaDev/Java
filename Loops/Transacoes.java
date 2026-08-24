package Loops;

import java.util.Scanner;

public class Transacoes {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double totalEntradas = 0;
        double totalSaidas = 0;


            for(int i = 0; i < 5; i++){
                System.out.println("digite o valor da transação (positivo para entrada, negativo para sáida");
                double transacao = sc.nextDouble();
                if (transacao > 0) {
                    totalEntradas = transacao + totalEntradas;
                } else{
                    totalSaidas = transacao + totalSaidas;
                }
            }

            System.out.println("total de entradas: " + totalEntradas);
            System.out.println("total de saidas: " + totalSaidas);

    }
}



