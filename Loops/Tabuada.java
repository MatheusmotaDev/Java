public class Tabuada{
    public static void main(String[] args) {
        

        for(int i = 1; i <=10; i++){
            System.out.println("tabuada do: " + i);
            System.out.println("-----------");
            for(int j = 1; j <= 10; j++){
                int multi = i * j;
                System.out.println(i + " X " + j + " = " + multi);
            }
            
        }

    }
}


