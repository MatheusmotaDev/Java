import java.util.Scanner;

public class CalculoPeso {

    
    public static double calcularIMC(double peso, double altura) {

        double resultado = peso / (altura * altura);

        return resultado;
        
        
        
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double pesoDigitado = sc.nextDouble();

        System.out.println("Digite a sua altura: ");
        double alturaDigitada = sc.nextDouble();

       
        double imcFinal = calcularIMC(pesoDigitado, alturaDigitada);

        System.out.println("seu IMC é: " + imcFinal);
        
        sc.close();
    }
}

