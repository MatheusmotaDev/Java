package poo.basico.aula3;

public class Main {

    public static void main(String[] args) {
        
        Livro ai = new Livro();
        Livro ui = new Livro();
        ai.titulo = "sheeps";
        ai.autor = "derick";
        ai.anoPublicacao = 1971;

        ui.titulo = "androides";
        ui.autor = "ovrick";
        ui.anoPublicacao = 1990;


        ai.mostrardados();
        System.out.println("____________");
        ui.mostrardados();
    }
    

}
