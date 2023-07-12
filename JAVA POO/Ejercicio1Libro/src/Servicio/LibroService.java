
package Servicio;

import Entidad.Libro;
import java.util.Scanner;


public class LibroService {
    
    private final  Scanner leer =  new Scanner(System.in).useDelimiter("\n");
    
    public Libro crearlibro() {
        
        System.out.println("Introducir ISBN del libro");
        int ISBN = leer.nextInt();
        
        System.out.println("Introducir el titulo del libro");
        String titulo = leer.next();
      
        
        System.out.println("Introducir el autor del libro");
        String autor = leer.next();
        
        
        System.out.println("Introducir el numero de paginas del libro");
        int nPaginas = leer.nextInt();
        
        
        return new Libro(ISBN, titulo, autor, nPaginas);
                
        
                
     }
    
    public static void  mostrarDatos (Libro libro) {
        
        System.out.println("ISBN: "+libro.getISBN()+" Titulo: "+libro.getTitulo()+" numero de paginas: "+libro.getnPaginas());
    }
        
}

