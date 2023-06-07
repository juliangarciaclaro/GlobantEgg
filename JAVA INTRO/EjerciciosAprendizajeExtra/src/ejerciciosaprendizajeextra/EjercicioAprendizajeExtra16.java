package ejerciciosaprendizajeextra;

import java.util.Scanner;

public class EjercicioAprendizajeExtra16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        do {
            System.out.println("dame el nombre de la persona");
            String nombre = leer.nextLine();
            System.out.println("dame la edad de la persona");
            int edad = leer.nextInt();
            
            if (edad < 18) {
                System.out.println(nombre + " tiene " + edad + " y no es mayor de edad");
            } else {
                System.out.println(nombre + " tiene " + edad + " y sí es mayor de edad");
            }
            
            leer.nextLine(); // Limpiar el búfer de entrada
            
            System.out.println("¿Desea seguir evaluando personas? (si/no)");
            String opcion = leer.nextLine().toLowerCase();
            
            if (opcion.equals("no")) {
                break;
            } else if (!opcion.equals("si")) {
                System.out.println("Esa opción no la conozco, sigamos trabajando.");
            }
            
        } while (true);
    }
}
