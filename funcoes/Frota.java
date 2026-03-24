import java.util.Scanner;

public class Frota {

    public static int calcularVansLotadas(int totalPessoas){

        int quantidade = totalPessoas / 15;
        return quantidade;

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a quantidade de pessoas: ");

        int pessoas = sc.nextInt();

        int vans = calcularVansLotadas(pessoas);

        System.out.println("a quantidade de vans lotadas foram: " + vans);

        


    }
}
