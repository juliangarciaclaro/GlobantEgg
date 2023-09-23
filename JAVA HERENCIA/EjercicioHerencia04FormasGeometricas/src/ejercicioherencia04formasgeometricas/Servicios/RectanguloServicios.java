
package ejercicioherencia04formasgeometricas.Servicios;

import ejercicioherencia04formasgeometricas.Entidad.Rectangulo;
import java.util.Scanner;


public class RectanguloServicios {
    
    public Rectangulo crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("dame la base del rectangulo");
        Double base = leer.nextDouble();
        System.out.println("dame la altura del rectangulo");
        Double altura = leer.nextDouble();
        
        return new Rectangulo(base,altura);
    }
}
