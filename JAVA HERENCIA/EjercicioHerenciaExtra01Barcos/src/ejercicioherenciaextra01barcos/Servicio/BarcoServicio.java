
package ejercicioherenciaextra01barcos.Servicio;

import ejercicioherenciaextra01barcos.Entidad.Barco;
import java.time.LocalDate;
import java.util.Scanner;


public class BarcoServicio {
    Scanner leer = new Scanner(System.in);
    
    public Barco crearBarco(){
        
        System.out.println("dame la matricula del barco");
        Integer matricula = leer.nextInt();
        System.out.println("dame la eslora del barco");
        Integer eslora = leer.nextInt();
        leer.nextLine();
        System.out.println("dame la fecha de fabricacion del barco en formato \"yyyy-MM-dd\"");
        String fechafabricacion = leer.nextLine();
        LocalDate anioFabricacion = LocalDate.parse(fechafabricacion);
        
        return new Barco(matricula,eslora,anioFabricacion);
    }
}
