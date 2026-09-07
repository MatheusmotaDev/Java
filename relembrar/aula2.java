public class aula2 {
    
    public static void main(String[] args) {
        
        double precoProduto = 50.0;
        double desconto = 20.0;

        double calculo = precoProduto * desconto/100;

        double valorfinal = precoProduto - calculo;

        System.out.println("o valor final é: " + valorfinal);

        if(valorfinal > 100.0){
            System.out.println("Compra com frete gratis!");
        } else{
            System.out.println("frete custará 15 reais");
        }


    }
}
