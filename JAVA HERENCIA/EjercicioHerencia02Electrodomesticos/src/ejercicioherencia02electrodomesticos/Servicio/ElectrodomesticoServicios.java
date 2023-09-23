package ejercicioherencia02electrodomesticos.Servicio;

import ejercicioherencia02electrodomesticos.Entidad.Electrodomestico;
import ejercicioherencia02electrodomesticos.Enum.Color;
import ejercicioherencia02electrodomesticos.Enum.ConsumoEnergetico;
import java.util.Scanner;

public class ElectrodomesticoServicios {

    Scanner leer = new Scanner(System.in);

    //servicios
    public Electrodomestico crearElectrodomestico() {
        Color colorElectrodomestico = comprobarColor();
        ConsumoEnergetico consumoElectrodomestico = comprobarConsumo();

        Integer peso;
        do {
            System.out.println("cual es el peso de su electrodomestico en kg?");
            peso = leer.nextInt();
            leer.nextLine();

            if (peso < 1) {
                System.out.println("vuelve a intentarlo ese peso no es valido");
            }
            
        } while (peso < 1);
        
        return new Electrodomestico (1000,colorElectrodomestico,consumoElectrodomestico,peso);
    }

    public Color comprobarColor() {
        System.out.println("De que color es su electrodomestico?");
        String color = leer.nextLine();
        for (Color aux : Color.values()) {
            if (aux.name().toLowerCase().equals(color.toLowerCase())) {
                return aux;
            }

        }
        return Color.BLANCO;
    }

    public ConsumoEnergetico comprobarConsumo() {
        System.out.println("Cual es la letra referente al consumo de su electrodomestico?");
        String letra = leer.nextLine();
        for (ConsumoEnergetico aux : ConsumoEnergetico.values()) {
            if (aux.name().toLowerCase().equals(letra.toLowerCase())) {
                return aux;
            }
        }
        return ConsumoEnergetico.F;
    }

}
