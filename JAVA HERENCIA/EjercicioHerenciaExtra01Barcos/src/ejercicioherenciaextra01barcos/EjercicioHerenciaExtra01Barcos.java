
package ejercicioherenciaextra01barcos;

import ejercicioherenciaextra01barcos.Entidad.Alquiler;
import ejercicioherenciaextra01barcos.Servicio.AlquilerServicio;


public class EjercicioHerenciaExtra01Barcos {

    
    public static void main(String[] args) {
        
        AlquilerServicio as = new AlquilerServicio();
        
        Alquiler alquiler = as.crearAlquiler();
        
        as.precioFinal(alquiler);
    }
    
    
}
