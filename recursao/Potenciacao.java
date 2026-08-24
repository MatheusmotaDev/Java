package recursao;

import java.util.Scanner;

public class Potenciacao {
    

    public static int pot(int base, int expoente){
        if(expoente <= 0){
            return 1;
        }

        return (base) * pot(base, expoente - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("digite a base");
        int base = sc.nextInt();

        System.out.println("digite o expoente: ");
        int expoente = sc.nextInt();

        int tudo = pot(base,expoente);


        System.out.println(tudo);
        
        sc.close();
    }
}


