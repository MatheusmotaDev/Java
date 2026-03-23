import java.util.Scanner;

public class Venda {

    public static double calcularPrecoVenda(double custoProduto, double margemLucro){
        double lucro = (custoProduto * (margemLucro / 100));

        double valorfinal = (lucro + custoProduto);

        return valorfinal;



    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Por favor, informe o custo do produto: ");
        double custodigitado = sc.nextDouble();

        System.out.println("agora a margem dele: ");
        double margemdigitada = sc.nextDouble();


        double soma = calcularPrecoVenda(custodigitado, margemdigitada);

        System.out.println("o total foi: " + soma);
        
    }
}
