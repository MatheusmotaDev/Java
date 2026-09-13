package poo.associacao.atv4;

import java.util.Scanner;


public class Cliente {
    String nome;
    int rg;
    String cpf;
    Telefone telefone;
    Data data;
    Endereco endereco;

    Cliente(){

    }

    Cliente(String nome, int rg, String cpf, Telefone telefone, Data data, Endereco endereco){
        this.nome = nome;
        this.rg = rg;
        this.cpf =cpf;
        this.telefone = telefone;
        this.data = data;
        this.endereco = endereco;
    }

    void cadastro(Scanner input){
        
        System.out.println("Cadastro de cliente ");
        System.out.println("///////////");
        System.out.println("digite o nome do cliente: ");
         nome = input.nextLine();
         System.out.println("RG do usuário: ");
         rg = input.nextInt();
         input.nextLine();
         System.out.println("Informe CPF: ");
         cpf = input.nextLine();
         

    }
    
    void exibir(){
        System.out.println("Cliente cadastrado com sucesso!");
        System.out.println("///////////////");
        System.out.println("Informações dele: ");

        System.out.println("nome: " + nome);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("CEP: " + endereco.cep);
        System.out.println("Telefone: " + "DDD: " + telefone.ddd + " número: " + telefone.numero);

        System.out.println("///////////");

        System.out.println("ano de criação do cliente no sistema: " + data.ano);


    }

}
