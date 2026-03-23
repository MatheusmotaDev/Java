import java.util.Scanner;

public class Senha {

    public static boolean isSenhaForte(String senhaDigitada){

        if(senhaDigitada.length() >= 8){
            return true;
        } else{
            return false;
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua senha: ");
        String senhaDigitada = sc.nextLine();

        boolean tamanho = isSenhaForte(senhaDigitada);

        if(tamanho == true){
            System.out.println("Senha aprovada");
        } else{
            System.out.println("a senha deve ter pelo menos 8 caracteres");
        }
        



    }
}
