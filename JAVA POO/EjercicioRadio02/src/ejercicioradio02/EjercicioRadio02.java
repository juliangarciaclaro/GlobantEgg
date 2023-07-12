
package ejercicioradio02;

import ejercicioradio02.Entidad.Circunferencia;
import ejercicioradio02.Servicios.CircunferenciaService;
import static ejercicioradio02.Servicios.CircunferenciaService.area;
import static ejercicioradio02.Servicios.CircunferenciaService.perimetro;


public class EjercicioRadio02 {

    
    public static void main(String[] args) {
        
        CircunferenciaService cv = new CircunferenciaService();
        
        System.out.println("vamos a calular el area y el perimetro de una circunferencia pero primero");
        
       
        Circunferencia circulo1 = cv.crearCircunferencia();
        
        area(circulo1);
        perimetro(circulo1);
        
    }
    
}
