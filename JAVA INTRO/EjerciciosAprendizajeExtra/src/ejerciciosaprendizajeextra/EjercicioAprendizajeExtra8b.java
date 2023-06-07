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
public class EjercicioAprendizajeExtra8b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        //definir variables
        int numero, contotal, contimpar, contpar;
        contotal = 0;
        contimpar = 0;
        contpar = 0;

        while (true) {

            System.out.println("ingrese un numero entero o ingrese 0 para salir del programa");
            numero = leer.nextInt();

            if (numero == 0) {
                break;
            }
            if (numero < 0) {
                continue;
            }
            contotal++;

            if (numero % 2 == 0) {
                contpar++;
            } else {
                contimpar++;
            }

            if (numero % 5 == 0) {
                break;

            }
        }
        
        System.out.println("total de numeros: "+contotal);
        System.out.println("total de pares: "+contpar);
        System.out.println("total impares: "+contimpar);
    }

}
