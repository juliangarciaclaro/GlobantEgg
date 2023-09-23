
package ejercicioherenciaextra01barcos.Servicio;

import ejercicioherenciaextra01barcos.Entidad.Barco;
import ejercicioherenciaextra01barcos.Entidad.BarcoLujo;
import java.util.Scanner;


public class BarcoLujoServicio  {
    Scanner leer = new Scanner(System.in);
    
    
    
    public BarcoLujo crearBarcoLujo(){
        
        BarcoServicio bs = new BarcoServicio();
        Barco barco = bs.crearBarco();
        System.out.println("dame la potencia CV del barco");
        Integer potenciaCV = leer.nextInt();
        System.out.println("dame el numero de camarotes");
        Integer camarotes = leer.nextInt();
        leer.nextLine();
        
        return new BarcoLujo(potenciaCV,camarotes,barco.getMatricula(),barco.getEslora(),barco.getAnioFabricacion());
        
    }
}
