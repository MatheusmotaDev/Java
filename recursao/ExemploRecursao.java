package recursao;

import java.util.Scanner;

public class ExemploRecursao {
    


    public static int ad (int n){
        

        if(n == 0 || n == 1){
            return n;
        }

        return n + ad(n - 1);

        
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("digite um número");

        int numero = sc.nextInt();


        int soma = ad(numero);

        System.out.println(soma);

        sc.close();




        


    }
}

