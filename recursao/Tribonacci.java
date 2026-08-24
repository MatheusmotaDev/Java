package recursao;

import java.util.Scanner;

public class Tribonacci {
    

    public static int tribo(int n){

        if( n <=1){
            return 0;
        } else if(n <=2){
            return 1;
        }

        return tribo(n - 1) + tribo(n - 2) + tribo(n - 3);


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("TRIBONACCI! ULALA");


        System.out.println("digite um numero: ");
        int numero = sc.nextInt();

        int soma = tribo(numero);


        System.out.println("RESULTADO:");
        System.out.println(soma);
        
        sc.close();

    }
}


