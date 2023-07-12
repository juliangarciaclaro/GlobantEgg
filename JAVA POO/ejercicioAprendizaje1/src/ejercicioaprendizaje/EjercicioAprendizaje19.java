/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaprendizaje;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjercicioAprendizaje19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        int[][] matriz = new int[3][3];
        int[][] matrizAntiSimetrica = new int[3][3];
        int[][] matrizTraspuesta = new int[3][3];

        //asignarle valores a las variables
        matriz[0][0] = 0;
        matriz[0][1] = -2;
        matriz[0][2] = 4;
        matriz[1][0] = 2;
        matriz[1][1] = 0;
        matriz[1][2] = 2;
        matriz[2][0] = -4;
        matriz[2][1] = -2;
        matriz[2][2] = 0;

        matrizAntiSimetrica[0][0] = 0;
        matrizAntiSimetrica[0][1] = 2;
        matrizAntiSimetrica[0][2] = -4;
        matrizAntiSimetrica[1][0] = -2;
        matrizAntiSimetrica[1][1] = 0;
        matrizAntiSimetrica[1][2] = -2;
        matrizAntiSimetrica[2][0] = 4;
        matrizAntiSimetrica[2][1] = 2;
        matrizAntiSimetrica[2][2] = 0;

        //hacer bucle para asignar valores a la variables traspuesta
        int contador = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if ((matriz[i][j] * -1) != matrizAntiSimetrica[i][j] && (matriz[i][j] != 0)) {
                    contador += 1;

                }

            }
        }
        
        //condicional para saber si es antisimetrica o no
        if (contador != 0) {
            System.out.println("no es antisimetrica");

        }else {
            System.out.println("es antisimetrica");
        }
            

    }
}
