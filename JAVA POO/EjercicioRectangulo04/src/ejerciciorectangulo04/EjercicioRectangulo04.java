package ejerciciorectangulo04;

import ejerciciorectangulo04.Rectangulo.Rectangulo;

public class EjercicioRectangulo04 {

    public static void main(String[] args) {

        Rectangulo rs = new Rectangulo();
        
       Rectangulo rectangulo1 = rs.crearRectangulo();
       
        System.out.println("la superficie del rectangulo es: "+rectangulo1.superficie()); 
        System.out.println("el perimetro del rectangulo es: "+rectangulo1.perimetro());
        System.out.println("---------------------");
        System.out.println("");
        rectangulo1.graficar();
       
    }

}
