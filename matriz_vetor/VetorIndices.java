package matriz_vetor;

import java.util.Scanner;

public class VetorIndices {
    
    public static void invertido(int[] vetor){
        
        for(int i = vetor.length - 1; i >= 0; i--){
            System.out.println(vetor[i]);
        }
    }

    

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int [] miau = new int [5];



        System.out.println("preencha os indices: ");
        for(int i = 0; i < miau.length; i++){
            miau[i] = sc.nextInt();
        }

        System.out.println("------------");
        invertido(miau);


    }
}



