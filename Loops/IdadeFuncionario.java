package Loops;

import java.util.Scanner;

public class IdadeFuncionario {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);


        int idade = 0;

        do {
            System.out.println("digite a idade do funcionario: (0 a 120) ");
            idade = sc.nextInt();
        } while (idade < 0 || idade > 120);


        System.out.println("idade cadastrada com sucesso! " +  " idade: ");
        System.out.println(idade);
        
    }

        
        



}



