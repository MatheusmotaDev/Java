package poo.associacao.atv4;

import java.util.Scanner;

public class Telefone {
    int ddd;
    int numero;

    Telefone(){

    }

    Telefone(int ddd, int numero){
        this.ddd = ddd;
        this.numero = numero;
    }

    void cadastro(Scanner input){
       
        System.out.println("digite o ddd");
        ddd = input.nextInt();
        System.out.println("agora digiteo numero");
        numero = input.nextInt();

    }
    
}
