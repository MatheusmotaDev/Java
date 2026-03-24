public class Atividade3 {
    public static void main(String[] args) {

        int pontuacao = 51;

        if (pontuacao < 30) {
            System.out.println("Jogador bronze");
        } else if (pontuacao < 100) {
            System.out.println("Jogador prata");
        } else {
            System.out.println("Jogador ouro");
        }

    }
}
    // no codigo original do enunciando, as ordem de execução estavam erradas, a ordem correta deveria ser:
    // jogador bronze, prata, ouro e NÃO prata, ouro e bronze

    //    if (pontuacao >= 50) {
      //  System.out.println("Jogador Prata");
    //} else if (pontuacao >= 100) {
     //   System.out.println("Jogador Ouro");
    //} else {
       // System.out.println("Jogador Bronze");
   // }
