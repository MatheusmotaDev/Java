package Loops;

import java.util.Scanner;

public class exe11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite o valor do seu aporte inicial: ");
        double aporteInicial = sc.nextDouble();

        System.out.println("digite a taxa mensal: ");
        double taxaMensal = sc.nextDouble();

        System.out.println("digite a quantidade de meses: ");
        int tempoMeses = sc.nextInt();

        for(int i = 0; i < tempoMeses; i++){
            aporteInicial = aporteInicial + (aporteInicial * (taxaMensal /100));
            System.out.println(aporteInicial);
        }
        
    }
}
