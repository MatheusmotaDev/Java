import java.util.Scanner;

public class atividade{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo a nossa loja!");


        System.out.println("insira o valor da compra: ");
        double valorCompra =sc.nextDouble();


       if(valorCompra < 0){
        System.out.println("Valor inválido");
       }
       
       else if(valorCompra <= 99.99){
        System.out.println("Você não teve desconto, o valor final foi: " + valorCompra);

       }
       else if(valorCompra <= 499.99){
        double desconto = (valorCompra * 0.10);
        double valorFinal = valorCompra - desconto;

        System.out.println("Desconto de 10% aplicado, o valor final foi: " + valorFinal);
       }
       else if(valorCompra >= 500.00){
        double desconto = (valorCompra * 0.20);
        double valorFinal = valorCompra - desconto;

        System.out.println("Desconto de 20% aplicado, o valor final foi: " + valorFinal);



       }
    }
}