package matriz_vetor;

import java.util.Scanner;

public class VetorEmpate {

    public static void comparar(int[] c, int[] d){

        
        for(int i = 0; i < c.length; i++){
            if(c[i] > d[i]){
                System.out.println("fiial C ganhou" + c[i]);
            } else if(d[i] > c[i]){
                System.out.println("filial D ganhou " + d[i]);
            } else{
                System.out.println("empate");
            }
        }

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int [] A = new int[3];
        int [] B = new int[3];

        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }


        for(int i = 0; i < B.length; i++){
            B[i] = sc.nextInt();
        }


        comparar(A, B);

    }
}



