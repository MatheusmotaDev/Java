// faça uma função que verifique se o usuário é maior de idade ou não e ele pode dirigir
// regras:
// as regras NAO podem ser feitas na main
// na main, solicite apenas a idade ao usuario

import java.util.Scanner;

public class MaiorIdade{


    public static String maiorIdade(int idade){

        if(idade >= 18){
            return "Pode dirigir";
        } else{
            return "nao pode dirigir";
        }

    }

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("digite sua idade");
            int id = sc.nextInt();

            String calculo = maiorIdade(id);

            System.out.println("o resultado  foi: " + calculo);
            
            sc.close();

    }
}

