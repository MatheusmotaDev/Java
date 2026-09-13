package poo.construtores.av3;

public class Main {
    public static void main(String[] args) {
        Filme warner = new Filme("interestelar", "ficcao", 2014);
        Filme disney = new Filme("Toy Story", "animacao", 1995);
        
    

        System.out.println(warner.titulo + warner.genero + warner.anoLancamento);
        System.out.println(disney.titulo + disney.genero + disney.anoLancamento);


    }
}
