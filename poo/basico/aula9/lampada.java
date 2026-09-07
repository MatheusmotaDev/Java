package poo.basico.aula9;

public class lampada {
    String modelo;
    String tipo;
    double potencia;
    double preco;
    int estoque;
    boolean disponivel;
    
    void tem(){
    if (disponivel == true) {
        System.out.println("temos o produto no estoque!");
    } else{
        System.out.println("infelizmente os produtos não está disponível no momento.");
    }
}

    void mostrar(){

        if (disponivel == false) {
            
        } else{
            System.out.println("produto: " + modelo);
            System.out.println("valor: " + preco);

        }

    
}




}



