package Loops;

import java.util.Scanner;

public class SenhaLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int senha = 2510;
        int digitar = sc.nextInt();

        while (senha != digitar) {
            System.out.println("Senha errada: " + digitar);
            digitar = sc.nextInt();
        }

        System.out.println("Senha liberada");
    }
}


