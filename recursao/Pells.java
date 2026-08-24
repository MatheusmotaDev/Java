package recursao;

public class Pells {


    public static int pell(int n){

        if (n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        }

        return 2 * pell( n -1 ) + pell(n - 2) ;


    }
    public static void main(String[] args) {

        int numero = 5;

        int calc = pell(numero);
        System.out.println(calc);
        
    }
}
