package recursao;

public class ComparaFibonacci {
    

public static double fib(int n){
    if(n == 1) return 1;
    if (n == 2) return 1;

    return fib(n - 1) + fib (n-2);
}


    static int numCalls = 0;

    
public static double meujeito (int n){
    numCalls = numCalls + 1;
    if(n ==1 || n == 2){
        return 1;
    }

    return meujeito(n -1) + meujeito (n-2);
}

public static void main(String[] args) {

    
    
    System.out.println(meujeito(4
        
    ));

}


}



