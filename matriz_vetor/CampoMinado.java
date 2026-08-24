import java.util.Scanner;

public class CampoMinado {

    public static void matriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0;  j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + "\t");
            } 
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        int [][] mar = new int[3][3];


        for(int i = 0; i < mar.length; i++){
            for(int j = 0; j < mar.length; j++){
                mar[i][j] = sc.nextInt();
            }
        }


        System.out.println("--------");
       matriz(mar);



        
    }
}


