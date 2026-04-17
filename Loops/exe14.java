package Loops;


import java.util.Scanner;

public class exe14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int maioresDeIdade = 0;
        System.out.println("digite uma idade ( ou um numero negativo para encerrar): ");
        int idade = sc.nextInt();

        while(idade >= 0){
            if (idade >= 18) {
                maioresDeIdade++;
            } 
            System.out.println("digite outra idade: ");
            idade = sc.nextInt();
        }

        System.out.println("total de pessoas maiories de idade: " + maioresDeIdade);
        
    }
}
