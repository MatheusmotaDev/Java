package poo.basico.aula7;

public class Aluno {
    String nome;
    int idade;
    String curso;
    double nota1;
    double nota2;

    public double calcularMedia(double media){
        return media = nota1 + nota2 /2;

    }

    void mostrarSituacao(double media){
        if(media >= 7){
            System.out.println("aprovado");
        } else{
            System.out.println("reprovado");
        }
    }



}


