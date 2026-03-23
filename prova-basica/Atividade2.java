import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura ambiente: ");
        double temperatura = sc.nextDouble();
        
        
        if(temperatura < 0){
            System.out.println("Congelante");
        } else if(temperatura <= 15.0){
            System.out.println("Frio");
        } else if(temperatura <= 25.0){
            System.out.println("Agradável");
        } else if(temperatura <= 35.0){
            System.out.println("Quente");
        } else if(temperatura > 35.0){
            System.out.println("Calor extremo!");
        }
        }
        


    }

