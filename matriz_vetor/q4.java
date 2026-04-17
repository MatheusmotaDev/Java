package matriz_vetor;

import java.util.Scanner;

public class q4 {
    


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int [] vetor = new int[5];

        int contagemsaque = 0;


        for(int i = 0;  i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] < 0){
                System.out.println("Saque detectado: " + vetor[i]);
                contagemsaque++;

            } 
        }


            System.out.println("total de saques: " + contagemsaque);

    }
}
