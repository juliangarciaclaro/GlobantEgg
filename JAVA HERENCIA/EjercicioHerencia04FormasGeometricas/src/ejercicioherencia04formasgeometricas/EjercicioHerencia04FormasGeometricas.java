
package ejercicioherencia04formasgeometricas;

import ejercicioherencia04formasgeometricas.Entidad.Circulo;
import ejercicioherencia04formasgeometricas.Entidad.Rectangulo;
import ejercicioherencia04formasgeometricas.Servicios.CirculoServicios;
import ejercicioherencia04formasgeometricas.Servicios.RectanguloServicios;

public class EjercicioHerencia04FormasGeometricas {

    public static void main(String[] args) {
        
        CirculoServicios cs = new CirculoServicios();
        RectanguloServicios rs = new RectanguloServicios();
        
        Circulo circulo = cs.crearCirculo();
        Rectangulo rectangulo = rs.crearRectangulo();
        
        circulo.perimetro();
        circulo.area();
        
        rectangulo.perimetro();
        rectangulo.area();
    }
    
}
