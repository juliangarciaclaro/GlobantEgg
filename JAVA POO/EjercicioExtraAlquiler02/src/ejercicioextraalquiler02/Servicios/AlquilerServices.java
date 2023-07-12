package ejercicioextraalquiler02.Servicios;

import ejercicioextraalquiler02.Entidad.Alquiler;
import ejercicioextraalquiler02.Entidad.Pelicula;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;


public class AlquilerServices {
    
    private Scanner leer = new Scanner(System.in);

    public Alquiler crearAlquiler(ArrayList<Pelicula> peliculas) {
        System.out.println("Ingrese el título de la película que desea alquilar:");
        String peliculaAlquilada = leer.nextLine();
        boolean peliculaEncontrada = false;

        for (Pelicula pelicula : peliculas) {
            if (peliculaAlquilada.equals(pelicula.getTitulo())) {
                peliculaEncontrada = true;
                pelicula.setDisponible(false);
                break;
            }
        }

        if (peliculaEncontrada) {
            System.out.println("Ingrese la fecha de alquiler en formato yyyy-mm-dd:");
            String fechaInicioStr = leer.nextLine();
            LocalDate fechaInicio = LocalDate.parse(fechaInicioStr);

            System.out.println("Ingrese la fecha de entrega de la película en formato yyy-mm-dd:");
            String fechaFinStr = leer.nextLine();
            LocalDate fechaFin = LocalDate.parse(fechaFinStr);

            while (fechaFin.isBefore(fechaInicio)) {
                System.out.println("La fecha de entrega está incorrecta. Debe ser posterior a la fecha de alquiler.");
                fechaFinStr = leer.nextLine();
                fechaFin = LocalDate.parse(fechaFinStr);
            }

            System.out.println("Ingrese el precio del alquiler de la película:");
            int precio = leer.nextInt();

            return new Alquiler(peliculaAlquilada, fechaInicio, fechaFin, precio);

        } else {
            System.out.println("La película solicitada no está disponible para alquilar.");
            return null;
        }

    }

    public void listarAlquileres(ArrayList<Alquiler> alquileres) {
        for (Alquiler alquiler : alquileres) {
            System.out.println(alquiler.toString());
            System.out.println("---------------------------------");
        }

    }

    public void buscarAlquilerPorFecha(Alquiler[] alquileres) {
        System.out.println("dame una fecha en formato yyyy-mm-dd en la cual quieras verificar si se alquilo alguna pelicula ");
        String fechaBuscarStr = leer.nextLine();
        LocalDate fechaBuscar = LocalDate.parse(fechaBuscarStr);
        int contador = 0;

        for (Alquiler alquiler : alquileres) {
            if (fechaBuscar.isEqual(alquiler.getFechaInicio())) {
                System.out.println("PELICULA ALQUILADA: ");
                System.out.println(alquiler.toString());
                contador += 1;
            }
        }
        if (contador == 0) {
            System.out.println("no tenemos peliculas alquiladas en esa fecha");

        }

    }
    
    public void ingresoTotalServicio(ArrayList<Alquiler> alquileres) {
        System.out.println("dame el titulo de la pelicula que alquilaste");
        String nombre = leer.nextLine();
        double valorPagado;
        boolean existe = false;
        for (Alquiler alquiler : alquileres) {
            if (nombre.equals(alquiler.getPeliculaAlquilada())) {
                int precio = alquiler.getPrecio();
                Period periodo = Period.between(alquiler.getFechaInicio(),alquiler.getFechaFin());
                int dias = periodo.getDays();
                if (dias<=3) {
                     valorPagado = 10;
                    
                } else {
                    valorPagado =10+(dias-3); 
                }
                existe = true;
                System.out.println("el valor a pagar por la peli es: "+valorPagado);
                break;
            }
        }
        if (!existe) {
            System.out.println("esa pelicula no ha sido alquilada");
        }
    }
}
