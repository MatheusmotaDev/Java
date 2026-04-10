package Loops;

import java.util.Scanner;

public class exe2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double pesoTotal = 0;

        System.out.println("quantas caixas quer cadastrar: ");
        int caixas = sc.nextInt();

        
        for(int i = 0; i < caixas; i++){
            System.out.println("digite a quantidade atual das caixas");
            double pesoNovo = sc.nextDouble();
            pesoTotal = pesoTotal + pesoNovo;
        }

        System.out.println(pesoTotal);
        
    }
}
