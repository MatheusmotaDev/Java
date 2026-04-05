import java.util.Scanner;

public class Trafego {

    public static double calcularMulta(int velocidade){

        if(velocidade <= 60){
            return 0.0;
        } else if(velocidade <= 80){
            return 150.0;
        } else {
            return 500.0;
        }

        

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("digite a sua velocidade");

        int velo = sc.nextInt();

        double calcular = calcularMulta(velo);

        System.out.println("Valor a pagar: R$ " + calcular);
        

    }
}
