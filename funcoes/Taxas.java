import java.util.Scanner;

public class Taxas {

    public static double calcularTaxa(double peca){

        if(peca > 1000){
            return peca * 0.05;
        } else{
            return peca * 0.10;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o valor da peça: ");

        double pecaDigitada = sc.nextDouble();

        double calculo = calcularTaxa(pecaDigitada);


        System.out.println("Voce vai pagar: " + calculo);
        


    }
}


