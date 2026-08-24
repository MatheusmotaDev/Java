import java.util.Scanner;



public class Asfalto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bem vindo ao sensor de asfalto inteligente!");


        System.out.println("Informe a leitura do sensor: ");
        double leitura = sc.nextDouble();

        if (leitura < 0) {
            System.out.println("Leitura inválida do sensor!");
        } else if(leitura <= 2.0){
            System.out.println("Via em boas condições!");
        } else if(leitura <= 5.0){
            System.out.println("Alerta: Buraco detectado. Adicionar à fila de monitoramento");

        } else{
            System.out.println("Perigo: Risco de danos a veículos. Solicitar reparo imediato!");
        }
        sc.close();

    }
}
