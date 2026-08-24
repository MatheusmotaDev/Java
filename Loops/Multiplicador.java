package Loops;


import java.util.Scanner;

public class Multiplicador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        
        System.out.println("digite o numero base: ");
        int base = sc.nextInt();

        for(int i = 1; i <= 10; i++ ){
            int multi = base * i;
            System.out.println(base + " x " + i + " = " + multi);

        }
        
    }
}



