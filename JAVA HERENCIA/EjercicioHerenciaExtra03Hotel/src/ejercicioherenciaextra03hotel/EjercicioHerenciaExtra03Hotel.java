
package ejercicioherenciaextra03hotel;

import ejercicioherenciaextra03hotel.Entidad.Alojamiento;
import ejercicioherenciaextra03hotel.Entidad.Camping;
import ejercicioherenciaextra03hotel.Entidad.Hotel4Estrellas;
import ejercicioherenciaextra03hotel.Entidad.Hotel5Estrellas;
import ejercicioherenciaextra03hotel.Entidad.Residencia;
import ejercicioherenciaextra03hotel.Enum.Gimnasio;
import ejercicioherenciaextra03hotel.Servicio.ConsultaServicio;
import java.util.ArrayList;
import java.util.Scanner;


public class EjercicioHerenciaExtra03Hotel {

    
    public static void main(String[] args) {
        // Hotel4Estrellas
        Hotel4Estrellas hotel1 = new Hotel4Estrellas(
            Gimnasio.A,
            "Restaurante1",
            150,
            100,
            200,
            5,
            200,
            "Hotel 4 Estrellas 1",
            "Calle 1",
            "Ciudad 1",
            "Gerente 1"
        );

        Hotel4Estrellas hotel2 = new Hotel4Estrellas(
            Gimnasio.B,
            "Restaurante2",
            120,
            80,
            150,
            4,
            180,
            "Hotel 4 Estrellas 2",
            "Calle 2",
            "Ciudad 2",
            "Gerente 2"
        );

        Hotel4Estrellas hotel3 = new Hotel4Estrellas(
            Gimnasio.A,
            "Restaurante3",
            200,
            120,
            250,
            7,
            250,
            "Hotel 4 Estrellas 3",
            "Calle 3",
            "Ciudad 3",
            "Gerente 3"
        );

        // Hotel5Estrellas
        Hotel5Estrellas hotel5Estrellas1 = new Hotel5Estrellas(
            10,
            20,
            5,
            Gimnasio.A,
            "Restaurante5Estrellas1",
            300,
            250,
            400,
            10,
            300,
            "Hotel 5 Estrellas 1",
            "Calle 4",
            "Ciudad 4",
            "Gerente 4"
        );

        Hotel5Estrellas hotel5Estrellas2 = new Hotel5Estrellas(
            8,
            15,
            3,
            Gimnasio.B,
            "Restaurante5Estrellas2",
            280,
            200,
            350,
            9,
            280,
            "Hotel 5 Estrellas 2",
            "Calle 5",
            "Ciudad 5",
            "Gerente 5"
        );

        Hotel5Estrellas hotel5Estrellas3 = new Hotel5Estrellas(
            12,
            25,
            6,
            Gimnasio.B,
            "Restaurante5Estrellas3",
            320,
            280,
            450,
            11,
            320,
            "Hotel 5 Estrellas 3",
            "Calle 6",
            "Ciudad 6",
            "Gerente 6"
        );

        // Camping
        Camping camping1 = new Camping(
            100,
            10,
            true,
            true,
            5000,
            "Camping1",
            "Calle Camping 1",
            "Ciudad Camping 1",
            "Gerente Camping 1"
        );

        Camping camping2 = new Camping(
            80,
            8,
            true,
            false,
            4000,
            "Camping2",
            "Calle Camping 2",
            "Ciudad Camping 2",
            "Gerente Camping 2"
        );

        Camping camping3 = new Camping(
            120,
            12,
            false,
            true,
            6000,
            "Camping3",
            "Calle Camping 3",
            "Ciudad Camping 3",
            "Gerente Camping 3"
        );

        // Residencia
        Residencia residencia1 = new Residencia(
            50,
            true,
            false,
            true,
            3000,
            "Residencia1",
            "Calle Residencia 1",
            "Ciudad Residencia 1",
            "Gerente Residencia 1"
        );

        Residencia residencia2 = new Residencia(
            40,
            false,
            true,
            false,
            2500,
            "Residencia2",
            "Calle Residencia 2",
            "Ciudad Residencia 2",
            "Gerente Residencia 2"
        );

        Residencia residencia3 = new Residencia(
            60,
            true,
            true,
            true,
            3500,
            "Residencia3",
            "Calle Residencia 3",
            "Ciudad Residencia 3",
            "Gerente Residencia 3"
        );

           ArrayList<Alojamiento> alojamientos = new ArrayList<>();

        // Agrega los objetos a la lista
        alojamientos.add(hotel1);
        alojamientos.add(hotel2);
        alojamientos.add(hotel3);
        alojamientos.add(hotel5Estrellas1);
        alojamientos.add(hotel5Estrellas2);
        alojamientos.add(hotel5Estrellas3);
        alojamientos.add(camping1);
        alojamientos.add(camping2);
        alojamientos.add(camping3);
        alojamientos.add(residencia1);
        alojamientos.add(residencia2);
        alojamientos.add(residencia3);
        
        ConsultaServicio cs = new ConsultaServicio();
        boolean isSalir = false;
        int opcion;
        do {
            System.out.println("Hola aqui puedes consultar nuestros alojamientos, marca la opcion numérica de busqueda que desees");
            System.out.println("1. todos los alojamientos disponibles");
            System.out.println("2. lista de hoteles del mas caro al mas barato ");
            System.out.println("3. lista de campings con restaurante");
            System.out.println("4. lista de residencias con descuento para gremios");
            System.out.println("5. salir");
            Scanner leer = new Scanner(System.in);
            opcion = leer.nextInt();
            
            switch  (opcion){
                case 1:
                    cs.todosLosAlojamientos(alojamientos);
                    break;
                case 2: 
                    cs.masCaroMasBarato(alojamientos);
                    break;
                case 3:
                    cs.campingConRestaurante(alojamientos);
                    break;
                case 4:
                    cs.residenciaConDescuento(alojamientos);
                    break;
                case 5:
                    System.out.println("hasta luego!!");
                    isSalir=true;
                    break;
                default:
                    System.out.println("opcion no valida, vuelve a intentar");
                    break;
            }
        } while (isSalir==false);
        
    }
    
}
