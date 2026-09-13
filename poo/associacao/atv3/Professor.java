package poo.associacao.atv3;

public class Professor {
    String nome;
    Departamento departamento;

    void mostrar(){
        System.out.println("Professor: " + nome);
        System.out.println("Departamento: " + departamento.nome);
    }
}
