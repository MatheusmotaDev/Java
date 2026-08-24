import java.util.Scanner;

public class Arquivos {

    public static String FormatarNomeArquivo(String nomeDigitado){
        String converter = nomeDigitado.toLowerCase();
        return converter;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite ai");
        String nome = sc.nextLine();

        String calculo = FormatarNomeArquivo(nome);

        System.out.println(calculo);
        
        sc.close();
    }
}
