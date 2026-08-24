import java.util.Scanner;

public class Bafometro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bem vindo ao sistema de bafometro do detran: ");

        System.out.println("Por favor, ao assoprar o bafometro, informe o resultado abaixo (ou digite -1 para recusa):");
        double triagem = sc.nextDouble();

        
        if (triagem < 0) {
            System.out.println("você será multado em até 3.000 R$ e sua CNH será suspensa por 12 meses, além da retenção do veículo conforme o (Art. 165-A)");
            
        
        } else if (triagem <= 0.04) {
            System.out.println("Você está liberado!");
            
        
        } else if (triagem <= 0.33) {
            System.out.println("Você cometeu infração gravíssima e tomou multa de 2.934.70 reais, além da sua CNH supensa por 12 meses.");
            
        
        } else {
            System.out.println("Crime de transito! Você será conduzido a delegacia e pode responder a processo criminal.");
        }

        sc.close(); 
    }
}

