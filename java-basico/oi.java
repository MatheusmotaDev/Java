import java.util.Scanner;

public class oi {

    public static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "     ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] bla = new int[4][4];

        for (int i = 0; i < bla.length; i++) {
            for (int j = 0; j < bla[i].length; j++) {
                bla[i][j] = sc.nextInt();
            }
        }

        imprimirMatriz(bla);
    }
}