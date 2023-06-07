/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizajeextra;

/**
 *
 * @author USUARIO
 */
public class EjercicioAprendizajeExtra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //definir variables
        int[] vector1 = {1, 2, 3, 4, 5, 6};
        int[] vector2 = {1, 2, 3, 4, 5, 6};
        boolean iguales;
        iguales = true;

        //logica para evaluar si los vectores son iguales o no
        
        for (int i = 0; i < 6; i++) {
            
            if (vector1[i]!=vector2[i]) {
                iguales = false;
                break;
                
            }
            
           
            }
        
        //logica para decir si son iguales o diferentes 
             if (iguales==true) {
                System.out.println("son iguales");
                
            }else {
                System.out.println("son diferentes");
        }
    }

}
