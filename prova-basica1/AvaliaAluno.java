import java.util.Scanner;


public class AvaliaAluno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("SISTEMA DE AVALIAÇÃO DE ALUNO");


        System.out.println("Digite sua nota: ");
        double nota = sc.nextDouble();

        System.out.println("Digite sua frequencia escolar; ");
        double frequencia = sc.nextDouble();

        if(nota < 0.0 || nota > 10.0 || frequencia < 0.0 || frequencia > 100.0){
            System.out.println("Dados inválidos!");
        } else if(frequencia < 75.0){
            System.out.println("Reprovado por falta");
        } else if(nota < 4.0){
            System.out.println("Reprovado por nota");
        } else if (nota <= 6.9 && frequencia >= 75.0){
            System.out.println("Em recuperação");
        } else if(nota >= 7.0 && frequencia >= 75.0){
            System.out.println("Aprovado!");

        }
    
        sc.close();
        
    }
}


