package poo.associacao.atv4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        Cliente p1 = new Cliente();
        Endereco e1 = new Endereco();
        Telefone t1 = new Telefone();
        Data d1 = new Data();

        p1.cadastro(input);
        e1.cadastro(input);
        t1.cadastro(input);
        d1.cadastro(input);

        p1.endereco = e1;
        p1.telefone = t1;
        p1.data = d1;
        


        p1.exibir();

        
    }
    
}
