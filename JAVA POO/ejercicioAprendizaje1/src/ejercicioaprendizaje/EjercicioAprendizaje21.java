/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaprendizaje;

/**
 *
 * @author USUARIO
 */
public class EjercicioAprendizaje21 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Inicializar M y P con los valores deseados
         int[][] M = {
            { 1, 26, 36, 47,  5,  6, 72, 81, 95, 10},
            {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
            {56, 78, 87, 90,  9, 90, 17, 12, 87, 67},
            {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
            {32, 76, 79,  1, 36,  5, 67, 96, 12, 11},
            {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
            {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
            {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
            {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
            {21, 68, 78, 97, 90, 67, 12, 41, 65, 12}
        };
        int[][] P = {
            { 36, 5, 67},
            { 89, 90, 75},
            { 14, 22, 26}
        };
        
        
        boolean encontrado = false;
        
        
        for (int i = 0; i < M.length - P.length + 1; i++) {
            for (int j = 0; j < M[i].length - P[0].length + 1; j++) {
                if (esSubmatriz(M, P, i, j)) {
                    System.out.println("P está contenida en M empezando en la fila " + i + " y la columna " + j);
                    encontrado = true;
                    break;
                }
            }
            if (encontrado) break;
        }
        if (!encontrado) System.out.println("P no está contenida en M");
    }
     private static boolean esSubmatriz(int[][] M, int[][] P, int fila, int columna) {
        for (int i = 0; i < P.length; i++) {
            for (int j = 0; j < P[i].length; j++) {
                if (M[fila + i][columna + j] != P[i][j]) return false;
            }
        }
        return true;
    }
    
}
