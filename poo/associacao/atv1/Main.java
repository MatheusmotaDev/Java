package poo.associacao.atv1;

public class Main {
    
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Endereco pa = new Endereco();
        p1.nome = "matheus";
        pa.rua = "uriel de holanda";
        pa.cidade = "recife";
        p1.endereco = (pa);
        p1.visualizar();

    }
}
