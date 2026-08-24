package prova_loops2;



import java.util.Scanner;

public class Urna {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int codigo = -1;
        int bolsonaro = 0;
        int lula = 0;

        while (codigo != 0) {
            System.out.println("1 - Candidato Bolsonaro");
            System.out.println("2 - Candidato Lula");
            System.out.println("----------");


            codigo = sc.nextInt();

            if (codigo == 1) {
                bolsonaro = bolsonaro + 1;
            } else if(codigo == 2){
                lula = lula + 1;
            } else{
                System.out.println("Voto nulo");
            }

        }

        System.out.println("votos do bolsonaro: " + bolsonaro);
        System.out.println("votos do lula: " + lula);


    }
}



