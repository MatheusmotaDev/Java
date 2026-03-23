import java.util.Scanner;

public class Email {

    public static String gerarEmail(String nome, String sobrenome){

        String email = (nome + "." + sobrenome + "@lume.com").toLowerCase();

        return email;



    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao sistema corporativo lume! ");


        System.out.println("Por favor informe seu nome!: ");
        String nomeDigitado = sc.nextLine();

        System.out.println("agora digite seu sobrenome!: ");
        String sobrenomeDigitado = sc.nextLine();


        String gerado = gerarEmail(nomeDigitado, sobrenomeDigitado);

        System.out.println("Seu email novo é: " + gerado);

        



    }
}
