
package ejercicio1libro;

import Entidad.Libro;
import Servicio.LibroService;
import static Servicio.LibroService.mostrarDatos;



public class Ejercicio1Libro {

    
    public static void main(String[] args) {
     
        LibroService sl = new LibroService();
        
        Libro libro1 = sl.crearlibro();
        
        mostrarDatos(libro1);
        
    }
    
    
}
