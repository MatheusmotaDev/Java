import java.util.Scanner;

public class Pomodoro{



    public static int calcularCiclos(int minutosEstudados){

        int ciclos = minutosEstudados / 25;

        return ciclos;




    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de minutos que voce estudou:");
        int minutos = sc.nextInt();

        int total = calcularCiclos(minutos);

        System.out.println("Voce concluiu " + total + " ciclos de foco total!");
        sc.close();

    }
}
