package Loops;

import java.util.Scanner;


public class exe6 {

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("quantos pacotes serão processados?:  ");
        int pacotes = sc.nextInt();

        int maiorPico = 0;

        for(int i = 0; i < pacotes; i++ ){
            System.out.println("digite a velocidade atual: ");
            int velocidadeAtual = sc.nextInt();
            if (velocidadeAtual > maiorPico) {
                maiorPico = velocidadeAtual;
            }
        }

        System.out.println("o pico máximo registrado foi: " + maiorPico);
        
    }
}

  



    

