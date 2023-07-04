public class App {
    public static void main(String[] args) throws Exception {

        int tamano = 8;

        int[][] tablero = new int[tamano][tamano];

        for(int i = 0; i < tamano; i++){
            for(int j = 0; j < tamano; j++){
                
                tablero[i][j] = 1;
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }

    }

}
