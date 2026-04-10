import java.util.Scanner;

public class While {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

            System.out.println("Bem vindo!");
        System.out.println("Atenção, o programa é encerrado se o valor for maior que 100!");
        System.out.println("digite o valor inicial de X: ");
       
        int x = sc.nextInt();

        System.out.println("-------------");
        System.out.println("Valor inserido!");
        System.out.println("-------------");




        System.out.println("-------------");
        System.out.println("o valor inicial de X é: " + x);
        System.out.println("-------------");
        


        while (x <= 100) {
            
            System.out.println("-------------");
            System.out.println("o valor atual de X agora é: " + x);
            x ++;
            
        }


    }
}
