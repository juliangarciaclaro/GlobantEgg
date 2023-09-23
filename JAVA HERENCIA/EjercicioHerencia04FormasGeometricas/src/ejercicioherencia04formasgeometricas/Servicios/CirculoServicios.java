package ejercicioherencia04formasgeometricas.Servicios;

import ejercicioherencia04formasgeometricas.Entidad.Circulo;
import java.util.Scanner;

public class CirculoServicios {

    public Circulo crearCirculo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("dame el radio del circulo");
        Double radio = leer.nextDouble();

        return new Circulo(radio);
    }
    
    
}
