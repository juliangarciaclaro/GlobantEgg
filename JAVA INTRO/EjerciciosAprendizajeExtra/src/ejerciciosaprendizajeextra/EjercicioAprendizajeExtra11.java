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
public class EjercicioAprendizajeExtra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        int numero, contador;
        contador = 0;

        System.out.println("dame un numero");
        numero = leer.nextInt();
        //logica para hallar cantidad de digitos

        while (numero != 0) {
            numero /= 10;
            contador+=1;
        }
        System.out.println("el numero tiene: "+contador+" digitos");
    }

}
