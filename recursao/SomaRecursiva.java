
package recursao;

import java.util.Scanner;

public class SomaRecursiva {
    

    public static int soma (int a,int b){
        if(b == 0){
            return 0;
        }

        return a + soma(a,b -1);
      
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("insira um número: ");
        int numero = sc.nextInt();
        int numero2 = sc.nextInt();


        int funcao = soma(numero,numero2);

        
        System.out.println(funcao);

        sc.close();

    }
}

