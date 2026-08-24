package recursao;

import java.util.Scanner;

public class FracaoRecursiva {
    

    public static double frac (double n){
        if(n <= 1){
            return 1;
        }

        return (1 / n) +frac(n -1);

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("digite um número");
        double numero = sc.nextDouble();

         double calc = frac(numero);

        System.out.println(calc);
        
        sc.close();
    }
}


