
package ejerciciopersona12;

import ejerciciopersona12.Entidad.Persona;
import java.util.Scanner;


public class EjercicioPersona12 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      Persona ps = new Persona();
      
      Persona persona1 = ps.crearPersona();
      
      persona1.calcularEdad();
      
        System.out.println("");
        System.out.println("dame una edad cualquiera, si la persona es menor será true, sino false");
        int edad = leer.nextInt();
        System.out.println(persona1.menorQue(edad));
     
        System.out.println("---------------");
        persona1.mostrarPersona();
        
    }
    
}
