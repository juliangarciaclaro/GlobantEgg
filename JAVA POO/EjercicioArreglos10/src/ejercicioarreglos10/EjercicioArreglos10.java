
package ejercicioarreglos10;

import java.util.Arrays;

public class EjercicioArreglos10 {

    
    public static void main(String[] args) {
     
        //definir variables
        
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        
        for (int i = 0; i < arregloA.length; i++) {
            //funcion para darle valores aleatorios a la variable
            arregloA[i] = Math.random() * 10;
            System.out.println((i+1)+"["+arregloA[i]+"] ");
        }
        System.out.println("-----------------------------");
        System.out.println("");
        //funcion que ordena el array de menor a mayor
        Arrays.sort(arregloA);
        
        for (int i = 0; i < arregloA.length; i++) {
            System.out.println((i+1)+"["+arregloA[i]+"] ");
        }
        System.out.println("----------------------------------");
        System.out.println("");
        for (int i = 0; i < arregloB.length; i++) {
            if (i<=9) {
                arregloB[i]=arregloA[i];
            } else if (i>9) {
                arregloB[i]= 0.5;
            }
           System.out.println((i+1)+"["+arregloB[i]+"] ");
        }
        
        
    }
    
  
}
