package poo.associacao.atv3;

public class Main {
    public static void main(String[] args) {
        Professor si = new Professor();
        Departamento in = new Departamento();
        si.nome = "daniel";
        in.nome = "sistemas para internet";
        si.departamento = (in);

        si.mostrar();
    }
}
