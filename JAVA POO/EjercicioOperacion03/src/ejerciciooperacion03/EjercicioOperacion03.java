package ejerciciooperacion03;

import ejerciciooperacion03.Entidad.Operacion;
import ejerciciooperacion03.Servicios.OperacionService;

public class EjercicioOperacion03 {

    public static void main(String[] args) {

        OperacionService os = new OperacionService();
        
        Operacion operacion1 = os.crearOperacion();
        
        System.out.println(operacion1.sumar()); 
        System.out.println(operacion1.restar());
        System.out.println(operacion1.multiplicar());
        System.out.println(operacion1.division());
        
        
    }

}
