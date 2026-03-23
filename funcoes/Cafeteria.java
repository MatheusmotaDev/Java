import java.util.Scanner;

public class Cafeteria {

    public static String fazerCafePadrao(){
        return "Aqui está seu Café Expresso";
    }


    public static String prepararPedido(String cliente){
        return "Preparando o café para " + cliente;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Qual é seu nome? ");
        String nomeDigitado = sc.nextLine();


        String fazercafe = prepararPedido(nomeDigitado);

        System.out.println(fazercafe);


        System.out.println((fazerCafePadrao()));


        

    }
}
