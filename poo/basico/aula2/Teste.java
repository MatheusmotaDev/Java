package poo.basico.aula2;

public class Teste {
    public static void main(String[] args) {
        
        produto p1 = new produto();
        p1.nome = "barbie";
        p1.marca = "mattel";
        p1.preco = 140.0;

        produto p2 = new produto("caneta azul", "bic");
        p2.preco = 32.0;

        produto p3 = new produto("maconha", "bigbig", 14.0);
        System.out.println(p1.nome + ", " + p2.nome + ", " + p3.nome);
    }
}
