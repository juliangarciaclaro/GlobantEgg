package ejercicioherencia02electrodomesticos.Servicio;

import ejercicioherencia02electrodomesticos.Entidad.Electrodomestico;
import ejercicioherencia02electrodomesticos.Entidad.Televisor;
import java.util.Scanner;

public class TelevisorServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ElectrodomesticoServicios es = new ElectrodomesticoServicios();

    // metodos
    public Televisor crearTelevisor() {

        Electrodomestico miElectrodomestico = es.crearElectrodomestico();

        Double resolucion;

        do {
            System.out.println("dame la las pulgadas del televisor");
            resolucion = leer.nextDouble();
            leer.nextLine();

            if (resolucion < 1) {
                System.out.println("no puede tener menos de 1 pulgada, vuelve a darme la medida");
            }
        } while (resolucion < 1);

        String tieneTDT;

        do {
            System.out.println("el televisor tiene TDT? Responda s/n");
            tieneTDT = leer.nextLine();

            if (!tieneTDT.equalsIgnoreCase("s") && !tieneTDT.equalsIgnoreCase("n")) {
                System.out.println("esa respuesta no es valida vuelva a responder");
            }

        } while (!tieneTDT.equalsIgnoreCase("s") && !tieneTDT.equalsIgnoreCase("n"));

        boolean TDT;
        if (tieneTDT.equalsIgnoreCase("s")) {
            TDT = true;
        } else {
            TDT = false;

        }

        Televisor miTelevisor = new Televisor(resolucion, TDT, miElectrodomestico.getPrecio(),
                miElectrodomestico.getColor(), miElectrodomestico.getcEnergetico(), miElectrodomestico.getPeso());
                miTelevisor.precioFinal();
        
        return miTelevisor;
    }
}
