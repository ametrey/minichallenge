public class App {
    public static void main(String[] args) throws Exception {

        int tamano = 8;

        int[][] tablero = new int[tamano][tamano];

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {

                if((i + j) % 2 == 0){
                tablero[i][j] = 1;
                System.out.print(tablero[i][j]);
                }else{
                tablero[i][j] = 0;
                System.out.print(tablero[i][j]);
                }
            }
            System.out.println();
        }

    }

}
