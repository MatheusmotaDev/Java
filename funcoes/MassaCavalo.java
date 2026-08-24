import java.util.Scanner;

public class MassaCavalo {

    public static double quantidadeNecessaria(double m, double h, double t){

        return (m * h / t) / 745.6999;

        


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a massa do cavalo: ");
        double massa =sc.nextDouble();

        System.out.println("Digite a altura do cavalo: ");
        double altura = sc.nextDouble();

        System.out.println("Digite o tempo: ");
        double tempo = sc.nextDouble();


       double potencia = quantidadeNecessaria(massa, altura, tempo);

       System.out.println("A potencia foi: " + potencia);

       


    }


}


