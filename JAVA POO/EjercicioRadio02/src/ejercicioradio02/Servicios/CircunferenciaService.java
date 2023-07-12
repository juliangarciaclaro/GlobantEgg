package ejercicioradio02.Servicios;

import ejercicioradio02.Entidad.Circunferencia;
import java.util.Scanner;

public class CircunferenciaService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Circunferencia crearCircunferencia() {
        System.out.println("dame el radio de la circunferencia");
        double radio = leer.nextDouble();

        return new Circunferencia(radio);

    }

    public static void area(Circunferencia circunferencia) {
        double radio = circunferencia.getRadio();
        double area = Math.PI * (radio * radio);
        System.out.println("el area es: " + area);
    }

    public static void perimetro(Circunferencia circunferencia) {
        double radio = circunferencia.getRadio();
        double perimetro = 2 * Math.PI * radio;
        System.out.println("el perimetro es: " + perimetro);

    }

}
