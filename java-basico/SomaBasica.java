import java.util.Scanner;

public class SomaBasica {


    public static int soma (int a, int b){
        return a + b;

    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        


        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("digite a segunda idade: ");
        int idade2 = sc.nextInt();


        int somar = soma(idade, idade2);


        System.out.println("a soma das idades é: " + somar);


        











    }
}

