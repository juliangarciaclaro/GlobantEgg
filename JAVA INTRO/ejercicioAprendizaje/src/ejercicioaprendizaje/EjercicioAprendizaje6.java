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
public class EjercicioAprendizaje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        int numero;

        //pedir el numero
        System.out.println("dame un numero");
        numero = leer.nextInt();

        //logica para saber si es par o impar a partir de un condicional
        if (numero % 2 == 0) {
            System.out.println("el numero es par");
        } else {
            System.out.println("el numero es impar");

        }

    }

}
