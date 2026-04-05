import java.util.Scanner;

public class Placa{

    public static boolean validarPlaca(String placa){
        if(placa.length() == 7){
            return true;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite a sua placa: ");
        String digitarplaca = sc.nextLine();

        boolean verificarplaca = validarPlaca(digitarplaca);

        System.out.println("A situação da placa é: " + verificarplaca);
        
        
    }
}