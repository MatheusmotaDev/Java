package Loops;


import java.util.Scanner;

public class exe7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double somaTotal = 0;
        int quantidadeItens = 0;

        System.out.println("digite o valor do item (ou 0 para fechar a conta): ");
        double valor = sc.nextDouble();


        while(valor != 0){
            somaTotal = valor + somaTotal;
            quantidadeItens++;
            valor = sc.nextDouble();

        }

        double ticketMedio = (somaTotal / quantidadeItens);
        System.out.printf("Total a pagar: %.2f%n", somaTotal);
        System.out.printf("Ticket médio: %.2f%n", ticketMedio);
    }
}
