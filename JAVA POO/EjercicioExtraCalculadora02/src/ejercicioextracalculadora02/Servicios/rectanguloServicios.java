
package ejercicioextracalculadora02.Servicios;

import ejercicioextracalculadora02.Entidades.Rectangulo;
import java.util.Scanner;


public class rectanguloServicios {
    Scanner leer = new Scanner(System.in);
    
    Rectangulo crearRectangulo() {
        System.out.println("dame la base");
        int base = leer.nextInt();
        System.out.println("dame la altura");
        int altura = leer.nextInt();
        
        return new Rectangulo(base,altura);
    }
}
