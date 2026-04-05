import java.util.Scanner;

public class Par{


    public static boolean verificarPar(int par){

            if(par % 2== 0){
                return true;
            } else{
                return false;
            }


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int numero = sc.nextInt();


        boolean verificar = verificarPar(numero);

        System.out.println("O numero é: " + verificar);


        

    }
}