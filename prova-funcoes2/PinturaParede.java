import java.util.Scanner;

public class PinturaParede {

    public static int metrosQuadrados(int latas){
        int quantidade = latas / 10;
        return quantidade;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite  a quantidade de paredes");

        int parede = sc.nextInt();
        
        int calculo = metrosQuadrados(parede);

        System.out.println(calculo);

        
    }
}


