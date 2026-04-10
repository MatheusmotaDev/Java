package Loops;


import java.util.Scanner;
public class exe5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite a idade do usuario: ");
        int idade = sc.nextInt();

        while (idade < 0 || idade >= 120) {
            System.out.println("IDADE INVALIDA! DIGITE NOVAMENTE: ");
            idade = sc.nextInt();
            
        }
        
        System.out.println("Cadastro liberado");
    }
}




