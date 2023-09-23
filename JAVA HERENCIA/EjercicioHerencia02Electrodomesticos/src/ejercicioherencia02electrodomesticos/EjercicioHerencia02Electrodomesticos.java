package ejercicioherencia02electrodomesticos;

import ejercicioherencia02electrodomesticos.Entidad.Electrodomestico;
import ejercicioherencia02electrodomesticos.Entidad.Lavadora;
import ejercicioherencia02electrodomesticos.Entidad.Televisor;
import ejercicioherencia02electrodomesticos.Servicio.LavadoraServicio;
import ejercicioherencia02electrodomesticos.Servicio.TelevisorServicio;
import java.util.ArrayList;

public class EjercicioHerencia02Electrodomesticos {

    public static void main(String[] args) {

        ArrayList<Electrodomestico> electrodomesticos = new ArrayList();

        LavadoraServicio ls = new LavadoraServicio();
        TelevisorServicio ts = new TelevisorServicio();

        Lavadora lavadora1 = ls.crearLavadora();
        Televisor televisor1 = ts.crearTelevisor();
        Lavadora lavadora2 = ls.crearLavadora();
        Televisor televisor2 = ts.crearTelevisor();

        electrodomesticos.add(televisor1);
        electrodomesticos.add(televisor2);
        electrodomesticos.add(lavadora1);
        electrodomesticos.add(lavadora2);

        int precioTotal = 0;
        int precioTV = 0;
        int precioLav = 0;

        for (Electrodomestico electrodomestico : electrodomesticos) {
            if (electrodomestico instanceof Lavadora) {
                System.out.println("---------------------------------------------------");
                System.out.println("esta lavadora tiene las siguientes características");
                System.out.println(electrodomestico.toString());
                precioLav+=electrodomestico.getPrecio();
                precioTotal+=electrodomestico.getPrecio();
                
            }
            
            if (electrodomestico instanceof Televisor) {
                System.out.println("---------------------------------------------------");
                System.out.println("este televisor tiene las siguientes caracteristicas");
                System.out.println(electrodomestico.toString());
                precioTV+=electrodomestico.getPrecio();
                precioTotal+=electrodomestico.getPrecio();
                
            }
        }
        

        System.out.println("---------------------------------------------------");
        System.out.println("el valor total de los televisores es:");
        System.out.println(precioTV);
        System.out.println("---------------------------------------------------");
        System.out.println("el valor total de las lavadoras es: ");
        System.out.println(precioLav);
        System.out.println("---------------------------------------------------");
        System.out.println("el valor total de todos los electrodomesticos es: ");
        System.out.println(precioTotal);
        }

    }
