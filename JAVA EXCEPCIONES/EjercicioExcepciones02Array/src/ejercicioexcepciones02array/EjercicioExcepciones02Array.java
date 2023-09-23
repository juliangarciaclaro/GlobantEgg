
package ejercicioexcepciones02array;

import java.util.ArrayList;

public class EjercicioExcepciones02Array {

   
    public static void main(String[] args) {

      int[] numeros = {1,2,3,4,5};
        
       
                    try {
                        System.out.println(numeros[7]);
                        
                    } catch (ArrayIndexOutOfBoundsException e){
                        System.out.println("esa posicion no extiste");
                    }

    }
    
}

