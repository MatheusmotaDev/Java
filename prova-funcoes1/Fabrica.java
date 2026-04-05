import java.util.Scanner;

public class Fabrica {


    public static int calcularCaixasCompletas(int totalProdutos){

        int prod = totalProdutos / 4;

        return prod;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite quantidade de produtos: ");
        int produtos = sc.nextInt();


        int caixa = calcularCaixasCompletas(produtos);


        System.out.println("a quantidade de caixas completas foi: " + caixa);


        

    }
}
