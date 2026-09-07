package poo.basico.aula9;

public class Main {
    public static void main(String[] args) {
        lampada la = new lampada();

        la.modelo = "lampada";
        la.tipo = "led";
        la.potencia = 1500;
        la.preco = 24.99;
        la.estoque = 15;
        la.disponivel = true;

        




        System.out.println("Super mercado bom preço");

        System.out.println("temos os seguintes itens:");


        la.tem();
        la.mostrar();





    }
}
