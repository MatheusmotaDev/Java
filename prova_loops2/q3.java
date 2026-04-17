package prova_loops2;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero base");
        int base = sc.nextInt();


        for(int i = 1; i <= 10; i++){
            int multiplicar = base * i;
             System.out.println(base + " X " + i + " = " + multiplicar);
        }

       

    }
}
