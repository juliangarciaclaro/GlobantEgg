import java.util.Scanner;

public class EjercicioAprendizaje20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[][] matriz = new int[3][3];

        System.out.println("Ingresa los valores de la matriz:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();

                while (matriz[i][j] < 1 || matriz[i][j] > 9) {
                    System.out.println("Ese valor no es válido, ingrésalo de nuevo:");
                    matriz[i][j] = leer.nextInt();
                }
            }
        }

        System.out.println("=======================================");

        // Imprimir la matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matriz[i][j]);
            }
            System.out.println();
        }

        if (esCuadradoMagico(matriz)) {
            System.out.println("Es un cuadrado mágico.");
        } else {
            System.out.println("No es un cuadrado mágico.");
        }
    }

    public static boolean esCuadradoMagico(int[][] matriz) {
        int sumaObjetivo = 15; // Suma objetivo en un cuadrado mágico de 3x3

        // Comprobar filas y columnas
        for (int i = 0; i < 3; i++) {
            int sumaFila = 0;
            int sumaColumna = 0;

            for (int j = 0; j < 3; j++) {
                sumaFila += matriz[i][j];
                sumaColumna += matriz[j][i];
            }

            if (sumaFila != sumaObjetivo || sumaColumna != sumaObjetivo) {
                return false;
            }
        }

        // Comprobar diagonales
        int sumaDiagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int sumaDiagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];

        if (sumaDiagonal1 != sumaObjetivo || sumaDiagonal2 != sumaObjetivo) {
            return false;
        }

        return true;
    }
}
