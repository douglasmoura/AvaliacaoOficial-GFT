package teste;
public class App {
    public static void main(String[] args) throws Exception {

        int[][] intArray = { {1,-1,0,1},{0,4,1,4},{2,3,2,4},{3,2,4,2} };


        for (int i=0; i< 4 ; i++)
        {

            for (int j=0; j < 4 ; j++){
            
                System.out.print("["+intArray[i][j]+"]" + " ");
                
                
            }
            System.out.println();
            
            
        }

        System.out.println("posição 4"); 
        System.out.println("Encima é o: "+intArray[0][1]);
        System.out.println("Há Esquerda é o: "+intArray[1][0]);
        System.out.println("Há Direita é o: "+intArray[1][2]);
        System.out.println("Embaixo é o: "+intArray[2][1]);


    
    }
}
