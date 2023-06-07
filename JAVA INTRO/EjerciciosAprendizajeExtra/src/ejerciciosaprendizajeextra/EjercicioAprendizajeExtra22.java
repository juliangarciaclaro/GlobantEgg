/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizajeextra;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjercicioAprendizajeExtra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        int n, m, suma;
        suma = 0;

        System.out.println("dame un numero de filas");
        n = leer.nextInt();
        System.out.println("dame un numero de columnas");
        m = leer.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                suma += matriz[i][j];
                System.out.print("["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }

    
        System.out.println("suma de los elementos de la matriz: "+suma);
    }

}
