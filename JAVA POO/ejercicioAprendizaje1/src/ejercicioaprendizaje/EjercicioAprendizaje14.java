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
public class EjercicioAprendizaje14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        String moneda;
        int dinero;
        boolean validacion = false;

        //pedir el tipo de moneda y pedir la cantidad de dinero
        System.out.println("a que moneda desea convertir el dinero");

        //validar que sea una moneda permitida
        do {
            moneda = leer.nextLine();
            if ("dolar".equals(moneda) || "yen".equals(moneda) || "libra".equals(moneda)) {
                System.out.println("muy bien!");
                validacion = true;
            } else {
                System.out.println("moneda invalida, escribala de nuevo");
            }
        } while (validacion == false);

        System.out.println("que cantidad de euros desea convertir");
        dinero = leer.nextInt();

        conversor(moneda, dinero);

    }

    public static void conversor(String moneda, int dinero) {

        switch (moneda) {
            case "libra":
                System.out.println("su cambio equivale a: " + dinero * 0.86 + " libras");
                break;
            case "dolar":
                System.out.println("su cambio equivale a: " + dinero * 1.28611 + " dolares");
                break;
            case "yen":
                System.out.println("su cambio equivale a: " + dinero * 129.852 + " yenes");
                break;
        }
    }

}
