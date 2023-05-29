/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String frase;

        //pide la frase
        System.out.println("dame una frase");
        frase = leer.nextLine();

        System.out.print(convertirFrase(frase));
    }

    public static String convertirFrase(String frase) {
      
        int longitud;
        longitud = frase.length();
        String letra, nuevaLetra;

        for (int i = 0; i == longitud; i++) {
            letra = frase.substring(i, i);

            switch (letra)  {

                case "a":
                    letra = "@";
                    break;

                case "e":
                    letra = "#";
                    break;

                case "i":
                    letra = "$";
                    break;

                case "o":
                    letra = "%";
                    break;

                case "u":
                    letra = "*";
                    break;
               
            }
            nuevaLetra = letra;
        }
           return nuevaLetra;
    }
