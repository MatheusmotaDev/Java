package poo.basico.aula4;

public class Main {
    public static void main(String[] args) {
        
        produto notebook = new produto();
        notebook.nome = "positivo";
        notebook.preco = 4300;
        notebook.quantidade = 1;

        produto celular = new produto();
        celular.nome = "motorola";
        celular.preco = 800;
        celular.quantidade = 2;

        System.out.println("Produtos disponíveis: ");
        notebook.mostrarEstoque();
        System.out.println("---------------------");
        celular.mostrarEstoque();
    }

    
    
}
