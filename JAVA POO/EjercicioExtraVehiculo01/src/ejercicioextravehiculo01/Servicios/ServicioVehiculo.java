
package ejercicioextravehiculo01.Servicios;

import ejercicioextravehiculo01.Entidad.Vehiculo;
import java.util.Scanner;


public class ServicioVehiculo {
    private Scanner leer = new Scanner(System.in);
    
    public Vehiculo crearVehiculo() {
        System.out.println("dame la marca de tu vehiculo");
        String marca = leer.nextLine();
        
        System.out.println("dame el modelo de tu vehiculo");
        String modelo = leer.nextLine();
        
        System.out.println("dame el año de tu vehiculo");
        int año = leer.nextInt();
        leer.nextLine();
        
        System.out.println("dame el tipo de tu vehiculo 'auto', 'moto'ó 'bici'");
        String tipo = leer.nextLine();
        
        while   (!"auto".equals(tipo) && !"moto".equals(tipo) && !"bici".equals(tipo)) {
            System.out.println("ese tipo de vehiculo no esta permitido, vuelve a escribirlo");
            tipo = leer.nextLine();
        }
        return new Vehiculo(marca,modelo,año,tipo);
    }
    
}
