package poo.projetos.projeto1;

public class Main {
    public static void main(String[] args) {
        Livro novo = new Livro();
        Autor n = new Autor();

        novo.Cadastro();
        n.cadastro();

        novo.autor = n;




        System.out.println("/////////////////////////////");
        System.out.println("INFORMAÇÕES SOBRE O LIVRO: ");

        novo.exibir();

        
    }
}
