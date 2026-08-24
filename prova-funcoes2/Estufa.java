import java.util.Scanner;

public class Estufa {

    public static String classificarClima(double temperatura){
        if(temperatura == 15.0){
            return "FRIO";
        } else if(temperatura <= 28.0){
            return "AGRADAVEL";
        } else{
            return "QUENTE";
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.err.println("digite ai");

        double numero = sc.nextDouble();

        String calculo = classificarClima(numero);

        System.out.println(calculo);
        
        sc.close();
    }
}
