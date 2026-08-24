import java.util.Scanner;

public class BafometroFuncao {

    public static boolean verificarMaioridade (int idade){
        if(idade >= 18){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("digite sua idade");

        int i = s.nextInt();

        boolean verificar = verificarMaioridade(i);

        System.out.println(verificar);
        
    }
}


