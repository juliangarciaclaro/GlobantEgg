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
public class EjercicioAprendizajeExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables

        int contpar = 0, contimpar = 0, contotal = 0;
        double numero;
        //logica 

        do {
            System.out.println("dame un numero");
            numero = leer.nextDouble();

            while (numero % 1 != 0) {
                System.out.println("numero no valido, damelo de nuevo, tiene que ser entero");
                numero = leer.nextDouble();

            }
            

            if (numero < 0) {
            } else if (numero % 2 == 0) {
                contpar++;
                contotal++;

            } else if (numero % 2 != 0) {
                contimpar++;
                contotal++;
            }

        } while (numero%5!=0);

      
        System.out.println("cantidad de numeros "+contotal);
        System.out.println("cantidad de pares "+contpar);
        System.out.println("cantidad de impares "+contimpar);
        
 
        
    }

}

