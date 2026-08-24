import java.util.Scanner;

public class LeituraVetor {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int vetor [] = new int [9];


        System.out.println("Digite os valores do seu vetor: ");

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();


         
        }


        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");
        System.out.println("-------------");

        


        System.out.println("Valores do seu vetor: ");

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }


        


        
    }
}

