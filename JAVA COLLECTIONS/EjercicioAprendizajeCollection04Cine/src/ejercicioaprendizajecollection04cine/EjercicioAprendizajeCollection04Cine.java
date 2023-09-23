
package ejercicioaprendizajecollection04cine;

import ejercicioaprendizajecollection04cine.Servicios.PeliculaServicios;


public class EjercicioAprendizajeCollection04Cine {

    
    public static void main(String[] args) {
        
        PeliculaServicios ps = new PeliculaServicios();
        
        ps.crearPelicula();
        System.out.println("-------------------------------");
        System.out.println(" ");
        ps.mostrarTodasLasPeliculas();
        System.out.println("-------------------------------");
        System.out.println(" ");
        ps.mostrarPeliculasMayor1hora();
        System.out.println("-------------------------------");
        System.out.println(" ");
        ps.ordenarPeliculasDuracionAscendente();
        System.out.println("-------------------------------");
        System.out.println(" ");
        ps.ordenarPeliculasDuracionDescendente();
        System.out.println("-------------------------------");
        System.out.println(" ");
        ps.ordenarPeliculaTituloAlfabeticamente();
        System.out.println("-------------------------------");
        System.out.println(" ");
        ps.ordenarPeliculaDirectorAlfabeticamente();
        System.out.println("-------------------------------");
        System.out.println(" ");
    }
    
}
