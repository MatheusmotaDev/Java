package matriz_vetor;

import java.util.Scanner;



public class q5 {

    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);


        int [] vetor = new int[5];

       
        System.out.println("preencha os IDs: ");
        for(int i = 0; i < vetor.length; i++){
            vetor[i] = sc.nextInt();
            
        }


        System.out.println("digite um ID específico para buscar: ");
        int idBusca = sc.nextInt();
        boolean encontrou = false;

        for(int i = 0; i < vetor.length;  i++){
            if (vetor[i] == idBusca) {
                encontrou = true;
            }
        }

        if(encontrou == true){
            System.out.println("esse cliente está cadastrado");
        } else{
            System.out.println("cliente não encontrado");
        }



    }
}
