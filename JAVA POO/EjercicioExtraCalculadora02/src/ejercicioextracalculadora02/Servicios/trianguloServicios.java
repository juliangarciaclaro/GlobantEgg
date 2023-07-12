
package ejercicioextracalculadora02.Servicios;

import ejercicioextracalculadora02.Entidades.Triangulo;
import java.util.Scanner;


public class trianguloServicios {
    Scanner leer = new Scanner(System.in);
    
    Triangulo crearTriangulo(){
        System.out.println("dame el lado A");
        int ladoA = leer.nextInt();
        System.out.println("dame la base");
        int base = leer.nextInt();
        System.out.println("dame el lado C");
        int ladoC = leer.nextInt();
        System.out.println("dame la altura");
        int altura = leer.nextInt();
        
        return new Triangulo(ladoA,base,ladoC,altura);
    }
}
