package poo.associacao.atv4;

import java.util.Scanner;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        
    }

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void cadastro(Scanner input){
        System.out.println("Informe as datas do cadastro manualmente: ");
        
        System.out.println("dia: ");
        dia = input.nextInt();
        System.out.println("mês: ");
        mes = input.nextInt();
        System.out.println("ano: ");
        ano = input.nextInt();

    }
    
}
