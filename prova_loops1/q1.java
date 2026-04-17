package prova_loops1;

import java.util.Scanner;

public class q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int codigo = -1;
        int paesQueijo = 0;
        int faturamento = 0;

        while (codigo != 0) {
            System.out.println("\n========== CARDÁPIO ==========");
            System.out.println("1 - Café expresso  | R$ 4,00");
            System.out.println("2 - Capuccino      | R$ 7,00");
            System.out.println("3 - Pão de queijo  | R$ 5,00");
            System.out.println("0 - Encerrar pedido");
            System.out.println("==============================");

            System.out.print("Digite o código do produto: ");
            codigo = sc.nextInt();

            if (codigo == 1) {
                faturamento += 4;
                System.out.println(" Café expresso adicionado!");
            } else if (codigo == 2) {
                faturamento += 7;
                System.out.println(" Capuccino adicionado!");
            } else if (codigo == 3) {
                faturamento += 5;
                paesQueijo++;
                System.out.println(" Pão de queijo adicionado!");
            } else if (codigo != 0) {
                System.out.println(" Produto não cadastrado, tente novamente.");
            }
        }

        System.out.println("\n========== RESUMO ==========");
        System.out.println("Faturamento total: R$ " + faturamento + ",00");
        System.out.println("Pães de queijo vendidos: " + paesQueijo);
        System.out.println("============================");

        sc.close();
    }
}