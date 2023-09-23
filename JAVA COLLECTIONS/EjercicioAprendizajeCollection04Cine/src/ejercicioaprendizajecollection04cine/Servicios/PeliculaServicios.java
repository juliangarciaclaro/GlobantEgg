package ejercicioaprendizajecollection04cine.Servicios;

import ejercicioaprendizajecollection04cine.Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PeliculaServicios {

    private Scanner leer = new Scanner(System.in);
    List<Pelicula> peliculas;

    //constructor
    public PeliculaServicios() {
        this.peliculas = new ArrayList();
    }

    public void crearPelicula() {
        boolean braker = true;

        do {

            System.out.println("quiere agregar una pelicula? ");
            System.out.println("1. SI ");
            System.out.println("2. NO");
            int opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("dame el nombre de la pelicula");
                    String nombre = leer.nextLine();
                    System.out.println("dame el nombre del director");
                    String director = leer.nextLine();
                    System.out.println("deme la duracion de la pelicula en horas");
                    Double duracion = leer.nextDouble();
                    peliculas.add(new Pelicula(nombre, director, duracion));
                    break;
                case 2:
                    System.out.println("adios");
                    braker = false;
                    break;
                default:
                    System.out.println("esa opcion no es valida");
                    break;
            }

        } while (braker == true);

    }

    public void mostrarTodasLasPeliculas() {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }

    public void mostrarPeliculasMayor1hora() {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.toString());
            }

        }
    }
    
    public void ordenarPeliculasDuracionAscendente(){
        
        Collections.sort(peliculas, (pelicula1,pelicula2) -> Double.compare(pelicula1.getDuracion(), pelicula2.getDuracion()));
        System.out.println("Orden ascendente por duracion");
        peliculas.forEach(pelicula -> System.out.println(pelicula.getTitulo()+" duración "+pelicula.getDuracion()));
    }
    
    public void ordenarPeliculasDuracionDescendente(){
        
        Collections.sort(peliculas, (pelicula1,pelicula2) -> Double.compare(pelicula2.getDuracion(), pelicula1.getDuracion()));
        System.out.println("Orden descendente por duracion");
        peliculas.forEach(pelicula -> System.out.println(pelicula.getTitulo()+" duración "+pelicula.getDuracion()));
    }
    
public void ordenarPeliculaTituloAlfabeticamente(){
    
 Collections.sort(peliculas, (pelicula1, pelicula2) -> pelicula2.getTitulo().compareToIgnoreCase(pelicula1.getTitulo()));
        System.out.println("\nPelículas ordenadas alfabéticamente por titulo (descendente):");
        peliculas.forEach(pelicula -> System.out.println(pelicula.getTitulo()));
}

public void ordenarPeliculaDirectorAlfabeticamente(){
    
 Collections.sort(peliculas, (pelicula1, pelicula2) -> pelicula2.getDirector().compareToIgnoreCase(pelicula1.getDirector()));
        System.out.println("\nPelículas ordenadas alfabéticamente por director (descendente):");
        peliculas.forEach(pelicula -> System.out.println(pelicula.getDirector()));
}
}
