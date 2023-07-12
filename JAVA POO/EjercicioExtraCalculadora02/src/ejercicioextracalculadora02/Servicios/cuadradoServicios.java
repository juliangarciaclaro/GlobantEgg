
package ejercicioextracalculadora02.Servicios;

import ejercicioextracalculadora02.Entidades.Cuadrado;
import java.util.Scanner;


public class cuadradoServicios {
    Scanner leer = new Scanner(System.in);
    
    Cuadrado crearCuadrado() {
        System.out.println("dame el tamaño en cm del lado del cuadrado");
        int lado = leer.nextInt();
        
        return new Cuadrado(lado);
    }
}
