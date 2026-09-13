package poo.projetos.projeto1;
import java.util.Scanner;

public class Livro {
    String titulo;
    int ano_publicacao;
    Autor autor;

    Livro(){

    }



   //Livro(String titulo, int ano_publicacao, Autor autor){
       // this.titulo = titulo;
       // this.ano_publicacao = ano_publicacao;
       // this.autor = autor;
    //}

    void Cadastro(){
        Scanner input = new Scanner(System.in);
        System.out.println("nome do livro: ");
        titulo = input.nextLine();
        System.out.println("ano que foi publicado: ");
        ano_publicacao = input.nextInt();
        input.close();
    
    }

    void exibir(){
        System.out.println("Livro: " + titulo);
        System.out.println("Ano de publicação: " + ano_publicacao);
        System.out.println("Autor: " + autor.nome);
    }





}
