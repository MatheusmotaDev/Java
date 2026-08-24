package matriz_vetor;

import java.util.Scanner;

public class BuscaVetor {

    public static int busca(double[] vetor, int quantidade, double obj){ 
        for(int i = 0; i < quantidade; i++){
            if(obj == vetor[i]){
                System.out.println("valor encontrado");
                return i;
            }
        }
        System.out.println("valor não encontrado");
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de elementos: ");
        int quantidade = sc.nextInt();
        double[] vetor = new double[quantidade];

        System.out.println("Preencha seu vetor de " + quantidade + " posições:");
        for(int i = 0; i < quantidade; i++){
            vetor[i] = sc.nextDouble();
        }

        System.out.print("Qual valor deseja buscar? ");
        double buscador = sc.nextDouble();

        busca(vetor, quantidade, buscador);
        sc.close();
    }
}


