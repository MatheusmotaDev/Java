package prova_loops2;


import java.util.Scanner;

public class LotesPecas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        System.out.println("digite a quantidade de lote: ");
        int quantidadeLote = sc.nextInt();

        int aprovado = 0;
        int reprovado = 0;


        for(int i = 0; i < quantidadeLote; i++){
            System.out.println("digite a quantidade de peças, ou seja + " + quantidadeLote);
            int peca = sc.nextInt();

            if(peca >= 10 && peca <=15){
                aprovado = aprovado + 1;
            } else{
                reprovado = reprovado + 1;
            }
        }

        System.out.println("Peças aprovadas: " + aprovado);
        System.out.println("Peças reprovadas: " + reprovado);
       

    }
}



