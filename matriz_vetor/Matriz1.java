package matriz_vetor;


import java.util.Scanner;

public class Matriz1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        int [] bla = new int[5];
        

            System.out.println("--------");
            
        for(int i = 0; i < 5; i++){
            bla[i] = sc.nextInt();
            
        }

        System.out.println("--------");

        System.out.println("seus INDICES");
        
        for(int i = 0; i < 5; i++){
            
            System.out.println(bla[i]);
            
        }
       
        System.out.println("--------");




    }
}



