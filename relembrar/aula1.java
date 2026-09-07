public class aula1{
    public static void main(String[] args) {
        
        double precoProduto = 150.0;
        double desconto = 20.0;

        double calculo = precoProduto * desconto/100;
        double precofinal = precoProduto - calculo;

        System.out.println("o valor final é: " + precofinal);

    }
}