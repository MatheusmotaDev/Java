package busca;

import java.util.Scanner;

public class Busca {
    

    public static int busc(int obj, int vetor[]){
        for(int i = 0; i < vetor.length; i++){
            if(obj == vetor[i]){
                System.out.println("valor encontrado na posição: "); return i;
            }
        }

        System.out.println("número não encontrado");
        return -1;
        
        
    }


    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);


    int[] vetor = {3, 4, 7, 8, 9};

    System.out.println("seu vetor:");
    for(int i = 0; i < vetor.length; i++){
        System.out.println(vetor[i]);
    }
    System.out.println("digite um numero a ser buscado");
    int numero = sc.nextInt();
    

    int sera = busc(numero,vetor);

    System.out.println(sera);

        
    }
}
