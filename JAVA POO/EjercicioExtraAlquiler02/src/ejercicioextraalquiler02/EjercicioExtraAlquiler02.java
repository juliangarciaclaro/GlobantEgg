
package ejercicioextraalquiler02;

import ejercicioextraalquiler02.Entidad.Alquiler;
import ejercicioextraalquiler02.Entidad.Pelicula;
import ejercicioextraalquiler02.Servicios.AlquilerServices;
import ejercicioextraalquiler02.Servicios.PeliculasServices;
import java.util.ArrayList;
import java.util.Scanner;


public class EjercicioExtraAlquiler02 {

    
    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   PeliculasServices ps = new PeliculasServices();
   AlquilerServices as = new AlquilerServices();
   
   boolean salir = false;
   int opcion;
   ArrayList<Pelicula> peliculas = new ArrayList<>();
   ArrayList<Alquiler> alquileres = new ArrayList<>();
   
   
        do {
            System.out.println("Estamos en blockbuster tienes estas opciones de acciones a realizar");
            System.out.println("---------------------------------------");
            System.out.println("1. crear pelicula");
            System.out.println("2. crear alquiler");
            System.out.println("3. listar peliculas disponibles");
            System.out.println("4. listar peliculas alquiladas");
            System.out.println("5. buscar pelicula por titulo");
            System.out.println("6. buscar pelicula por genero");
            System.out.println("7. calcular ingreso total del servicio");
            System.out.println("8. salir");
            System.out.println("---------------------------------------");  
            System.out.println("Que opcion escoges, escribe un numero");
            opcion = leer.nextInt();
            while  (opcion < 1 || opcion > 8) {
                System.out.println("esa opcion no es valida, escribe un numero de las opciones anteriores");
                opcion = leer.nextInt();
            }
            
            switch  (opcion) {
                case 1:
                    peliculas.add(ps.crearPelicula());
                    break;
                case 2: 
                    alquileres.add(as.crearAlquiler(peliculas));
                    break;
                case 3:
                    ps.listarPeliculasDisponibles(peliculas);
                    break;
                case 4:
                    as.listarAlquileres(alquileres);
                    break;
                case 5:
                    ps.buscarPeliculaPorTitulo(peliculas);
                    break;
                case 6:
                    ps.buscarPeliculaPorGenero(peliculas);
                    break;
                case 7: 
                    as.ingresoTotalServicio(alquileres);
                    break;
                case 8:
                    System.out.println("Muchas gracias por utilizar nuestros servicios");
                    salir=true;
                    break;
            }
            
            
        } while (salir== false);
        
    }
    
}
