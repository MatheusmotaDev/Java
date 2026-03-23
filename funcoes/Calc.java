import java.util.Scanner;

public class Calc {

    
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

        // Aqui a mágica acontece! O gerente CHAMA a função e entrega os dados.
        double imcFinal = calcularIMC(pesoDigitado, alturaDigitada);

        System.out.println("seu IMC é: " + imcFinal);
        
        sc.close();
    }
}