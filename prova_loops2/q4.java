package prova_loops2;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pesos = sc.nextInt();

        int pesado = pesos;
        int leve = pesos;

        while(pesos != -1){
            if (pesos > pesado) {
               pesado = pesos;

            } else if(pesos < leve){
                leve = pesos;
            } 
            
            pesos = sc.nextInt();
        }


        

        System.out.println("mais pesada: " + pesado);
        System.out.println("mais leve: " + leve);


        
    }
}
