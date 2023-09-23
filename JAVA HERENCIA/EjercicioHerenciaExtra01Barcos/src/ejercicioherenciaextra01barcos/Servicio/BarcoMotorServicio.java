
package ejercicioherenciaextra01barcos.Servicio;

import ejercicioherenciaextra01barcos.Entidad.Barco;
import ejercicioherenciaextra01barcos.Entidad.BarcoMotor;
import java.util.Scanner;


public class BarcoMotorServicio {
    Scanner leer = new Scanner(System.in);
    
    
    public BarcoMotor crearBarcoMotor(){
        
        BarcoServicio bs = new BarcoServicio();
        Barco barco = bs.crearBarco();
        
        System.out.println("dame la potencia CV del barco");
        Integer potenciaCV = leer.nextInt();
        leer.nextLine();
        
        return new BarcoMotor(potenciaCV,barco.getMatricula(),barco.getEslora(),barco.getAnioFabricacion());
        
    }
}
