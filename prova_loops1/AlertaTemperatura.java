package prova_loops1;


import java.util.Scanner;

public class AlertaTemperatura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
       int soma = 0;
       int contador = 0;
        int maior = 0;
       

       System.out.println("digite a temperatura: ");
       int temp = sc.nextInt();

       if(temp >= 999){
        System.out.println("sem leituras");
       } else{
         maior = temp;
       }

       while(temp != 999){
        if (temp > maior) {
            maior = temp;
           
        } 

         soma = soma + temp;
            contador++;

        temp = sc.nextInt();
       }

       int media = (soma/contador);

       System.out.println("maior: " + maior);
       System.out.println("media: " + media);
       
    sc.close();

    }
}



