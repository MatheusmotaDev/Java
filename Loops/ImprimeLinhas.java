package Loops;


import java.util.Scanner;

public class ImprimeLinhas {

    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("-----------");
        System.out.println("você tem 3 tentativas antes que seu cartão seja bloqueado");            
        System.out.println("Digite sua senha: ");
        int senha = sc.nextInt();
        int tentativas = 1;

        

        while (senha != 9999 && tentativas < 3) {
            System.out.println("senha errada! essa foi sua: " + tentativas + " tentativa antes de bloquear");
            senha = sc.nextInt();
            tentativas++;
        }

        if (senha == 9999) {
            System.out.println("acesso liberado");
        } else{
            System.out.println("acesso bloqueado");
        }

        
    }
}



