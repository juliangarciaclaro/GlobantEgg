package ejercicioherenciaextra03hotel.Servicio;

import ejercicioherenciaextra03hotel.Entidad.Alojamiento;
import ejercicioherenciaextra03hotel.Entidad.Camping;
import ejercicioherenciaextra03hotel.Entidad.Hotel;
import ejercicioherenciaextra03hotel.Entidad.Hotel4Estrellas;
import ejercicioherenciaextra03hotel.Entidad.Hotel5Estrellas;
import ejercicioherenciaextra03hotel.Entidad.Residencia;
import java.util.ArrayList;
import java.util.Collections;

public class ConsultaServicio {

    public void todosLosAlojamientos(ArrayList<Alojamiento> alojamientos) {

        System.out.println("contamos con los siguientes alojamientos");
        for (Alojamiento alojamiento : alojamientos) {
            System.out.println(alojamiento.getNombre());
        }
        System.out.println("---------------------------------------");

    }

    public void masCaroMasBarato(ArrayList<Alojamiento> alojamientos) {

        ArrayList<Hotel4Estrellas> hoteles4 = new ArrayList();
        ArrayList<Hotel5Estrellas> hoteles5 = new ArrayList();

        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Hotel4Estrellas) {
                Hotel4Estrellas hotel = (Hotel4Estrellas) alojamiento;
                hotel.calcularPrecio();
                hoteles4.add(hotel);
            } else if (alojamiento instanceof Hotel5Estrellas) {
                Hotel5Estrellas hote2 = (Hotel5Estrellas) alojamiento;
                hote2.calcularPrecio();
                hoteles5.add(hote2);
            }

        }

        Collections.sort(hoteles4, (h1, h2) -> h2.getPrecioHabitacion().compareTo(h1.getPrecioHabitacion()));
        Collections.sort(hoteles5, (h1, h2) -> h2.getPrecioHabitacion().compareTo(h1.getPrecioHabitacion()));

        System.out.println("esta es la lista de los hoteles segun precios de mas caro a mas barato");

        for (Hotel5Estrellas hotel : hoteles5) {
            System.out.println(hotel.getNombre() + " " + hotel.getPrecioHabitacion());
        }
        for (Hotel4Estrellas hotel : hoteles4) {
            System.out.println(hotel.getNombre() + " " + hotel.getPrecioHabitacion());
        }
    }

    public void campingConRestaurante(ArrayList<Alojamiento> alojamientos) {

        System.out.println("los campings que tienen restaurante son: ");

        for (Alojamiento alojamiento : alojamientos) {

            if (alojamiento instanceof Camping) {
                Camping camping = (Camping) alojamiento;

                if (camping.isTieneRestaurante()) {
                    System.out.println(camping.getNombre() + " " + camping.isTieneRestaurante());
                }

            }

        }
    }

    public void residenciaConDescuento(ArrayList<Alojamiento> alojamientos) {

        System.out.println("las residencias con descuento son: ");

        for (Alojamiento alojamiento : alojamientos) {

            if (alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;

                if (residencia.isTieneDescuentos()) {
                    System.out.println(residencia.getNombre() + " " + residencia.isTieneDescuentos());
                }

            }
            {

            }

        }
    }

}
