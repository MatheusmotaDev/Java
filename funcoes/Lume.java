import java.util.Scanner;


public class Lume {

    public static double calcularSaldoLivre(double renda, double despesas){

        double resultado = renda - despesas;

        return resultado;
    }

    public static String classificarPerfil(double saldo){

        if(saldo < 0){
            return "Alerta vermelho, orçamento negativo";
        } else if(saldo <= 100){
            return "Alerta amarelo: Risco de quebra";
        } else if(saldo <= 500.0){
            return "perfil poupador";
        } else
            return "perfil investidor";


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("////////////////////////////");
        System.out.println("////////////////////////////");
        System.out.println("SISTEMA LUME");
        System.out.println("////////////////////////////");
        System.out.println("////////////////////////////");

        System.out.println("Por favor, informe seu nome: ");
        String nome = sc.nextLine();

        System.out.println("////////////////////////////");
        System.out.println("////////////////////////////");
        System.out.println("////////////////////////////");
        System.out.println("////////////////////////////");


        System.out.println("olá " + nome + ", Bem vindo ao sistema LUME, por gentileza, informe sua renda semanal");
        double rendamensal = sc.nextDouble();

        System.out.println("e agora qual sua despesa mensal? ");
        double despesamensal = sc.nextDouble();


        double saldoatual = calcularSaldoLivre(rendamensal, despesamensal);
        String perfilinvestidor = classificarPerfil(saldoatual);

        System.out.println("////////////////////////////");
        System.out.println("////////////////////////////");
        System.out.println("////////////////////////////");
        System.out.println("////////////////////////////");

        System.out.println(nome);
        System.out.println("seu saldo atual é: " + saldoatual);

        System.out.println("seu perfil  é: " + perfilinvestidor);


        
        sc.close();

    }
}
