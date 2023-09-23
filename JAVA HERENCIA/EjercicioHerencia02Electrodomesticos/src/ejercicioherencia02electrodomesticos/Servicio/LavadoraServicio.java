package ejercicioherencia02electrodomesticos.Servicio;

import ejercicioherencia02electrodomesticos.Entidad.Electrodomestico;
import ejercicioherencia02electrodomesticos.Entidad.Lavadora;
import java.util.Scanner;

public class LavadoraServicio {

    Scanner leer = new Scanner(System.in);
    ElectrodomesticoServicios es = new ElectrodomesticoServicios();

    public Lavadora crearLavadora() {

        Electrodomestico miElectrodomestico = es.crearElectrodomestico();

        Integer carga;
        do {
            System.out.println("Indique la carga que soporta la lavadora");
            carga = leer.nextInt();

            if (carga < 1) {
                System.out.println("esa carga no es valida, damela de nuevo");
            }
        } while (carga < 1);
        
        Lavadora miLavadora = new Lavadora(carga,miElectrodomestico.getPrecio(),miElectrodomestico.getColor(),
                                  miElectrodomestico.getcEnergetico(),miElectrodomestico.getPeso());
        
        miLavadora.precioFinal();
        
        return miLavadora;
    }
}
