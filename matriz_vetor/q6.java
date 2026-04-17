package matriz_vetor;


import java.util.Scanner;

public class q6 {

    public static void buscarPares(int[] gaveta){

        for(int i = 0; i < gaveta.length; i++){
            if(gaveta[i] % 2 == 0){
                System.out.println(gaveta[i]);
            }
        }

        
        }


    public static void main(String[] args) {
        
        

        Scanner sc = new Scanner(System.in);

        int [] vetor = new int[5];


        System.out.println("preencha as 5 gavetas: ");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
        }


        System.out.println("---------");
        System.out.println("Os números pares da gaveta foram:");
         buscarPares(vetor);

    }
    
}
