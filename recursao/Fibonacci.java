package recursao;

import java.util.Scanner;

public class Fibonacci {
    
    public static int cont = -1;

    public static int calcfib (int n){
        
        cont ++;

        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        }

        return calcfib(n -1) + calcfib(n-2);
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        

        int fib = calcfib(numero);

        System.out.println("o resuldo de fib " + numero + " é " + fib + " e teve " + cont + " chamadas recursivas");

        sc.close();

        
    }
}


