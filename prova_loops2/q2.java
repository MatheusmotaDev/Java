package prova_loops2;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int senha = 0;

        do {

            senha = sc.nextInt();

            if(senha == 2026){
                System.out.println("Acesso liberado");
            } else{
                System.out.println("Acesso negado");
            }
            
        } while (senha != 2026);

        
        

        

    }
}
