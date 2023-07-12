
package ejercicioextravehiculo01;

import ejercicioextravehiculo01.Entidad.Vehiculo;
import ejercicioextravehiculo01.Servicios.ServicioVehiculo;
import java.util.Scanner;


public class EjercicioExtraVehiculo01 {

    
    public static void main(String[] args) {
        
        //instanciar objetos
       Scanner leer = new Scanner(System.in);
       
        ServicioVehiculo sv = new ServicioVehiculo();
        
        //instanciar vehiculos
        Vehiculo vehiculo1 = sv.crearVehiculo();
        Vehiculo vehiculo2 = sv.crearVehiculo();
        Vehiculo vehiculo3 = sv.crearVehiculo();
        
        //mostrar cuanto avanzan segun los segundos
        System.out.println(vehiculo1.getTipo()+" anvanzó "+vehiculo1.moverse(5)+" metros en 5 segundos");
        System.out.println(vehiculo2.getTipo()+" anvanzó "+vehiculo2.moverse(5)+" metros en 5 segundos");
        System.out.println(vehiculo3.getTipo()+" anvanzó "+vehiculo3.moverse(5)+" metros en 5 segundos");
        System.out.println("");
        System.out.println(vehiculo1.getTipo()+" anvanzó "+vehiculo1.moverse(10)+" metros en 10 segundos");
        System.out.println(vehiculo2.getTipo()+" anvanzó "+vehiculo2.moverse(10)+" metros en 10 segundos");
        System.out.println(vehiculo3.getTipo()+" anvanzó "+vehiculo3.moverse(10)+" metros en 10 segundos");
        System.out.println("");
        System.out.println(vehiculo1.getTipo()+" anvanzó "+vehiculo1.moverse(60)+" metros en 1 minuto");
        System.out.println(vehiculo2.getTipo()+" anvanzó "+vehiculo2.moverse(60)+" metros en 1 minuto");
        System.out.println(vehiculo3.getTipo()+" anvanzó "+vehiculo3.moverse(60)+" metros en 1 minuto");
        
        System.out.println(vehiculo1.getTipo()+" avanzó "+(vehiculo1.moverse(300)+vehiculo1.frenar())+" metros en 5 minutos");
        System.out.println(vehiculo1.getTipo()+" avanzó "+(vehiculo2.moverse(300)+vehiculo2.frenar())+" metros en 5 minutos");
        System.out.println(vehiculo1.getTipo()+" avanzó "+(vehiculo3.moverse(300)+vehiculo3.frenar())+" metros en 5 minutos");
    }
    
}
