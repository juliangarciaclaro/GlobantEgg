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
public class EjercicioAprendizaje12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        String cadena;
        int correcta, incorrecta;
        
        correcta = 0;
        incorrecta = 0;
        
        
        do {
            
              System.out.println("dame una cadena");
              cadena = leer.nextLine();

            //logica para validar parametros
            if ((cadena.length()<=5) && ("x".equals(cadena.substring(0,1))) && ("o".equals(cadena.substring(cadena.length()-1)))) {
                correcta += 1;
            } else if ("&&&&&".equals(cadena)) {
                correcta +=1;
            }else {
                incorrecta += 1;
            }
    
        
        
 
        } while (!"&&&&&".equals(cadena));
        
      // imprimir sumatoria de correctas e incorrectas
        System.out.println("cadenas correctas: " + correcta);
        System.out.println("cadenas incorrectas: " + incorrecta);
        
        

    }

}
