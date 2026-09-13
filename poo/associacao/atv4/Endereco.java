package poo.associacao.atv4;

import java.util.Scanner;

public class Endereco {
    String nome_logradouro;
    int cep;
    String bairro;
    String cidade;
    String estado;

Endereco(){

}

Endereco(String nome_logradouro, int cep, String bairro, String cidade, String estado){
    this.nome_logradouro = nome_logradouro;
    this.cep = cep;
    this.bairro = bairro;
    this.cidade = cidade;
    this.estado = estado;
}

void cadastro(Scanner input){

    System.out.println("digite o logradouro: ");
    nome_logradouro = input.nextLine();
    System.out.println("digite o cep: ");
    cep = input.nextInt();
    input.nextLine();
    System.out.println("digite o bairro: ");
    bairro = input.nextLine();
    System.out.println("digite a cidade");
    cidade = input.nextLine();
    System.out.println("digite o estado");
    estado = input.nextLine();
    
}

    
}
