import java.util.Scanner;

public class Emprestimo {

    public static boolean aprovarEmprestimo(int scoreCredito){
        if(scoreCredito >= 700){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Olá, bem vindo ao sistema de emprestimos,");


        System.out.println("Qual seu score atual do SERASA?");
        int score =sc.nextInt();


        boolean credito = aprovarEmprestimo(score);


        if(credito == true){
            System.out.println("Emprestimo aprovado");
        } else {
            System.out.println("negado");
        }
        sc.close();

    }
}
