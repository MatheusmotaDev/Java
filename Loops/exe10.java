package Loops;

import java.util.Scanner;

public class exe10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um valor maior que zero: ");
        int valor = sc.nextInt();

        int acumulador = 1;


        for(int i = 1; i <= valor; i++){
            acumulador = i * acumulador;

        }

        System.out.println("valor: " + acumulador);

    }
}