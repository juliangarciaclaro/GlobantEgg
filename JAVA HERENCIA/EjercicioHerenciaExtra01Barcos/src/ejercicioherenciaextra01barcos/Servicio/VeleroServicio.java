
package ejercicioherenciaextra01barcos.Servicio;

import ejercicioherenciaextra01barcos.Entidad.Barco;
import ejercicioherenciaextra01barcos.Entidad.Velero;
import java.util.Scanner;


public class VeleroServicio  {
    Scanner leer = new Scanner(System.in);
    
    
    public Velero crearVelero(){
        
        BarcoServicio bs = new BarcoServicio();
        Barco barco = bs.crearBarco();
        System.out.println("dame el numero de mastiles");
        Integer mastiles = leer.nextInt();
        leer.nextLine();
        
        return new Velero(mastiles,barco.getMatricula(),barco.getEslora(),barco.getAnioFabricacion());
    }
}
