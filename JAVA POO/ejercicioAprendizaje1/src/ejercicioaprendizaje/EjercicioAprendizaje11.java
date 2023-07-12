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
public class EjercicioAprendizaje11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        int numero1, numero2, opcionNum;
         String opcionLetra;
         opcionLetra = "";

        //pedir numeros
        System.out.println("dame dos numeros");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();

        //armar el bucle para el menu
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("Elija una opcion");
            System.out.println("5. Salir");

            //pedir la opcion a elegir
            opcionNum = leer.nextInt();

            switch (opcionNum) {
                case 1:
                    System.out.println("la suma de los numeros es: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("la resta de los numeros es: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("la multiplicacion de los numeros es: " + (numero1 * numero2));
                    break;
                case 4:
                    //definir el decimal(double)
                    double division = (double) numero1 / numero2;
                    System.out.println("la division de los numeros es: " + division);
                    break;
                case 5:
                    System.out.println("esta seguro que desea salir del programa? s/n");             
                    opcionLetra = leer.next();
                    break;
                default:
                    System.out.println("opcion invalida");
                    break;
            }

        } while (!opcionLetra.equalsIgnoreCase("s"));

    }

}