package prova_loops1;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     
     int numero = sc.nextInt();
     int somaDivisores = 0;

     for(int i = 1; i < numero; i++){
        if (numero % i == 0) {
            somaDivisores = somaDivisores + i;
        }
     }

     if (somaDivisores == numero) {
        System.out.println("É perfeito");
     } else{
        System.out.println("nao é perfeito");
     }

    }
}
