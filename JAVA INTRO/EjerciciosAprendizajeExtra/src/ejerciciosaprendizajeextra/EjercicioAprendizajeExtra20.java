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
public class EjercicioAprendizajeExtra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //definir variables
        int[] vector = new int[5];
        
        rellenarvector(vector);
        
        System.out.print("vector: ");
        mostrarvector(vector);
        
        System.out.println("");
        
    }
    
    
            
  

public static void rellenarvector(int[] vector){
        
    for (int i = 0; i < 5; i++) {
        vector[i] = (int) (Math.random() * 10);
    }
    }

public static void mostrarvector(int[]vector){
    for (int i = 0; i < 5; i++) {
        System.out.print(vector[i]);
        
        
    }
}
}