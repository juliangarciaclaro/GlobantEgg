
package ejercicioextracalculadora02.Servicios;

import ejercicioextracalculadora02.Entidades.Hexagono;
import java.util.Scanner;


public class hexagonoServicios {
    Scanner leer = new Scanner(System.in);
    
    Hexagono crearHexagono() {
        System.out.println("dame el lado del hexagono");
        int lado = leer.nextInt();
        
        System.out.println("dame el apotema del hexagono");
        int apotema = leer.nextInt();
        
        return new Hexagono(lado,apotema);
    }
}
