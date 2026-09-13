package poo.projetos.projeto1;
import java.util.Scanner;


public class Autor {

    String nome;
    String nacionalidade;

    void cadastro(){
        System.out.println("nome do autor: ");
        Scanner sc = new Scanner(System.in);
        nome = sc.nextLine();
        sc.close();
        
    }
    
}
