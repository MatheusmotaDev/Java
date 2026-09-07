package poo.basico.aula8;

public class Caneta {
    String modelo;
    String cor;
    double ponta;
    int carga;
    boolean tampada;


    void status(){
        System.out.println("a caneta é de qual cor? " + this.cor);
        System.out.println("ela está tampada? " + this.tampada);
    }


    void rabiscar(){
        if(tampada){
            System.out.println("ERRO");
        } else{
            System.out.println("RABISCO");
        }
    }

    void tampar(){
        tampada = true;
    }



}
