package busca;

public class Ult {
    
    public static int busca(int[] v, int obj){
        int ultimo = -1;

        for(int i = 0; i < v.length; i++ ){
            if(obj == v[i]){
                ultimo = i;
            }
        }

        return ultimo;
    }



public static void main(String[] args) {

    int[] v = {2, 4, 2, 8};
    System.out.println(busca(v, 2));

}

}
