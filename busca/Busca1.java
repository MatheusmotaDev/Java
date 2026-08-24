package busca;

public class Busca1 {
    

    public static int bu (int x, int[] v){
        for(int i = 0; i < v.length; i++){
            if (x == v[i]) {
                System.out.println("objetivo encontrado na posição: "); return i;
                
            }
        }

        System.out.println("não econtrado");
        return -1;

    }


    public static void main(String[] args) {
        
    }
}
