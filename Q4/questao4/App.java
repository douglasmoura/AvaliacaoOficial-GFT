import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
      
        List<Integer> primos = new ArrayList<Integer>();
        for (int i = 3; i <= 999; i++) {
            if(sePrimo(i)){
            primos.add(i);
            }
        }  
        System.out.println(primos);
    }


     //verifica se é primo
     private static boolean sePrimo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;   
        }
        return true;
    }   
}