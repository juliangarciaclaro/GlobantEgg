package ejerciciooperacion03.Servicios;

import ejerciciooperacion03.Entidad.Operacion;
import java.util.Scanner;

public class OperacionService {

    private Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        System.out.println("dame el numero 1");
        double numero1 = leer.nextDouble();

        System.out.println("dame el numero 2");
        double numero2 = leer.nextDouble();

        return new Operacion(numero1, numero2);

    }

  
}
