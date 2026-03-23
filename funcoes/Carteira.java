import java.util.Scanner;

public class Carteira {

    public static double converterMoeda(double BRL){

        double converter = BRL / 5.00;

        return converter;


    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Bem vindo ao conversor do LUME! ");


        System.out.println("Informe sua quantia em REAIS");
        double dinheiroDigitado = sc.nextDouble();

        double converta = converterMoeda(dinheiroDigitado);

        System.out.println("A cotação atual é: " + converta);
        



    }
}
