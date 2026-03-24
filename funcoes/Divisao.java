import java.util.Scanner;

public class Divisao {

    public static int calcularCaixas(int totalOvos){
        int caixacompletas = totalOvos / 12;

        return caixacompletas;
    }

    public static int calcularSobra(int totalOvos){

        int sobra = totalOvos % 12;
        return sobra;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a quantidade de ovos: ");
        int ovos = sc.nextInt();

        int caixa = calcularCaixas(ovos);

        System.out.println("o total de caixas que foram necessários para guardar a quantidade de " + ovos + " ovos foi: " + caixa);
        System.out.println("a quantidade de ovos que sobrou e não coube nas caixas foram: " + calcularSobra(ovos));


        

    }
}
