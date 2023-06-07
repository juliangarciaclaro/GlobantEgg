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
public class EjericioAprendizajeExtra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        int N, M, edad, sumM = 0;
        double promedioedad = 0;

        //pedir cantidad de familias
        System.out.println("dame la cantidad de familias");
        N = leer.nextInt();

        //logica para obtener la cantidad total de hijos y la sumatoria total de edades 
        for (int i = 1; i <= N; i++) {
            System.out.println("que cantidad de hijos tiene la familia " + i);
            M = leer.nextInt();
            sumM += M;
            for (int j = 1; j <= M; j++) {
                System.out.println("dame la edad del hijo #" + j);
                edad = leer.nextInt();
                promedioedad += edad;
            }

        }
        
        //obtener el promedio
        
        promedioedad /= sumM;
        System.out.println("el promedio de edad de los hijos de todas las familias es: " + promedioedad);
    }

}
