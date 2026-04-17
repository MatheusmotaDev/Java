package Loops;



import java.util.Scanner;


public class exe12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("1 - Analisar dados");
            System.out.println("2- Gerar Relatório");
            System.out.println("0- sair");
            System.out.println("-------");
            opcao = sc.nextInt();
            if (opcao == 1) {
                System.out.println("Análise iniciada");
            } else if(opcao == 2){
                System.out.println("Relatório em andamento");
            } else if(opcao == 0){

            } else{
                System.out.println("---------");
                System.out.println("comando inválido, tente novamente: ");
            }

        }

        System.out.println("Terminal encerrado com sucesso");

    }
}
