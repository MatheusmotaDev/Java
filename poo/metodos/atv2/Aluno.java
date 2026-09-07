package poo.metodos.atv2;

public class Aluno {
    String nome;
    int matricula;
    String curso;
    String disciplina1;
    String disciplina2;
    String disciplina3;
    double notad1;
    double notad2;
    double notad3;


    void situacao(){
        if(notad1 >= 7){
            System.out.println(nome + ", parabéns!! está aprovado na disciplina " + disciplina1);
        } else{
            System.out.println(nome + ", infelizmente você foi reprovado");
        }
    }
    
}
