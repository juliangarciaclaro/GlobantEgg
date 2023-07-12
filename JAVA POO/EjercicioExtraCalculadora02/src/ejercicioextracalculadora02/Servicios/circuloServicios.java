
package ejercicioextracalculadora02.Servicios;

import ejercicioextracalculadora02.Entidades.Circulo;
import java.util.Scanner;


public class circuloServicios {
    Scanner leer = new Scanner(System.in);
    
    Circulo crearCirculo() {
        System.out.println("dame el radio del circulo");
        int radio = leer.nextInt();
        return new Circulo(radio);
    }
}
