import java.util.Scanner;

public class Juros{

    public static double valorEmprestimo(double valorEmprestimo, double taxaPercentual, int meses){

        double JurosTotais = (valorEmprestimo * (taxaPercentual / 100) * meses);

        return JurosTotais;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double v = sc.nextDouble();
        double t = sc.nextDouble();
        int m = sc.nextInt();

        Double calculo = valorEmprestimo(v, t, m);

        System.out.println(calculo);
        
        sc.close();
    }
}
