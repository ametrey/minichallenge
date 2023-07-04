import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            int tamano;
            menu();
            tamano = scanner.nextInt();
            resultado(tamano);
        } catch (InputMismatchException e) {
            System.out.println("El dato ingresado no es un número");
        }
    }

    public static void menu() {

        System.out.println("Bienvenido al generador de tableros: ");
        System.out.print("ingrese el tamaño del tablero (por ejemplo 100 generará un tablero de 100x100): ");
    }

    public static void resultado(int tamano) {
        int[][] tablero = new int[tamano][tamano];

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {

                if ((i + j) % 2 == 0) {
                    tablero[i][j] = 1;
                    System.out.print(tablero[i][j]);
                } else {
                    tablero[i][j] = 0;
                    System.out.print(tablero[i][j]);
                }
            }
            System.out.println();
        }
    }
}
