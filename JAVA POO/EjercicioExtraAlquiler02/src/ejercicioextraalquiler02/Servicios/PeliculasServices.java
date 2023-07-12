package ejercicioextraalquiler02.Servicios;

import ejercicioextraalquiler02.Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Scanner;

public class PeliculasServices {

    private Scanner leer = new Scanner(System.in);

    public Pelicula crearPelicula() {
        System.out.println("dame el titulo de la pelicula");
        String titulo = leer.nextLine();
        System.out.println("dame el genero de la pelicula");
        String genero = leer.nextLine();
        System.out.println("dame el año de la pelicula");
        int anio = leer.nextInt();
        System.out.println("dame la duracion en minutos de la pelicula");
        int duracion = leer.nextInt();
        boolean disponible = true;

        return new Pelicula(titulo, genero, anio, duracion, disponible);
    }

    public void listarPeliculasDisponibles(ArrayList<Pelicula> peliculas) {
        boolean disponibles= true;
        for (Pelicula pelicula : peliculas) {
            if (pelicula.isDisponible() == true) {
                System.out.println(pelicula.toString());
                System.out.println("----------------------------");
            } else {
                disponibles = false;
            }
        }
        if (!disponibles) {
            System.out.println("no hay peliculas disponibles");
        }
    }

    public void buscarPeliculaPorTitulo(ArrayList<Pelicula> peliculas) {
        System.out.println("dame el nombre de la pelicula que quieres buscar");
        String nombre = leer.nextLine();
        boolean existe = false;
        for (Pelicula pelicula : peliculas) {
            if (nombre.equals(pelicula.getTitulo())) {
                existe = true;
                break;
            }
        }
        if (existe) {
            System.out.println("si tenemos esa pelicula dentro del catalogo");
        } else {
            System.out.println("no tenemos esa pelicula dentro del catalogo");
        }
    }
    
    public void buscarPeliculaPorGenero(ArrayList<Pelicula> peliculas) {
        System.out.println("dame el genero de la pelicula que quieres buscar");
        String genero = leer.nextLine();
        boolean existe = false;
        for (Pelicula pelicula : peliculas) {
            if (genero.equals(pelicula.getGenero())) {
                existe = true;
                break;
            }
        }
        if (existe) {
            System.out.println("si tenemos peliculas dentro del catalogo en ese genero");
        } else {
            System.out.println("no tenemos  peliculas dentro del catalogo en ese genero");
        }
    }
}
