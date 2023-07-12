
package ejerciciocadena08;

import ejerciciocadena08.Entidad.Cadena;
import java.util.Scanner;


public class EjercicioCadena08 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       
        System.out.println("dame una frase");
        String frase = leer.nextLine();
   
        Cadena cadena1 = new Cadena(frase);
        System.out.println("----------------------------------");
        cadena1.contarVocales();
         System.out.println("----------------------------------");
        cadena1.invertirFrase();
         System.out.println("----------------------------------");
        System.out.println("dame una letra para ver cuantas veces se repite en la frase");
        String letra = leer.nextLine();
        
        cadena1.vecesRepetido(letra);
         System.out.println("----------------------------------");
        System.out.println("dame una segunda frase para comparala con la primera");
        String frase2 = leer.nextLine();
        
        cadena1.compararLongitud(frase2);
         System.out.println("----------------------------------");
        System.out.println("dame una frase para unirla a la primera frase");
        frase2 = leer.nextLine();
        
        cadena1.unirFrases(frase2);
         System.out.println("----------------------------------");
        System.out.println("dame una letra para reemplazar las a´s de la frase");
        letra = leer.nextLine();
        
        cadena1.reemplazar(letra);
         System.out.println("----------------------------------");
        System.out.println("dame una letra y te dire si es verdadero o falso que esta contenida en la frase");
        letra = leer.nextLine();
        
        System.out.println(cadena1.contiene(letra));
        System.out.println("----------------------------------");
        
        
    
    }
}
