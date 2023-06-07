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
public class EjercicioAprendizajeExtra17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        double numero;

        //pedir numero
        System.out.println("dame un numero y te digo si es primo o no");
        numero = leer.nextDouble();

        if (primo(numero)) {
            System.out.println("es numero primo");

        } else {
            System.out.println("no es numero primo");
        }

    }

    public static boolean primo(double numero) {
        boolean primo;
        primo = true;
        
        if (numero<=1) {
            primo = false;
            return primo;
        }
        int contador = 0;
        for (int i = 2; i <= numero; i++) {
            if (numero%i == 0) {
                contador+=1;
            }
        }
        if (contador > 1) {
            primo = false;
        } 
        return primo;
    }

}
