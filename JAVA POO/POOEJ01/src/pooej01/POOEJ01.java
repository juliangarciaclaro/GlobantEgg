package pooej01;

import Entidad.Persona;
import java.util.Scanner;
import static Servicio.PersonaService.MostrarPersona;

public class POOEJ01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //instanciacion de objeto con constructor vacio
        Persona persona1 = new Persona();

        //instanciacion de objeto con constructor por parametro
        Persona persona2 = new Persona("Julian", "12345", 34);
        
        persona1.setNombre(leer.next());

        System.out.println("el nombre de la primera persona es: " + persona1.getNombre());
        System.out.println(" ");
        System.out.println("el nombre de la segunda persona es: " + persona2.getNombre());
        System.out.println(" ");
        
        MostrarPersona(persona1);

    }

}
