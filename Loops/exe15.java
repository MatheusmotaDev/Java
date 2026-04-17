package Loops;



import java.util.Scanner;

public class exe15 {
    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero inteiro: ");
        int numero = sc.nextInt();

        int divisores = 0;

        for(int i = 1;  i <= numero; i++){
            if (numero % i == 0) {
                divisores++;
            }

           
        }

         if (divisores == 2) {
                System.out.println("o número é primo!");
            } else{
                System.out.println("o número NÃO é primo");
            }


    }
        
    }

