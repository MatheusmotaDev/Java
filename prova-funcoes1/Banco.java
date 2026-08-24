import java.util.Scanner;


public class Banco{



    public static String classificarRisco(double valorTransacao){

        if(valorTransacao > 10000.0){
            return "Alto risco";
        } else{
            return "Baixo risco";
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("digite o valor da transacao: ");
        double transacao = sc.nextDouble();


        String analise = classificarRisco(transacao);

        System.out.println(analise);
        
        sc.close();
    }
}
