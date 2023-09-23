
package ejercicioherencia04formasgeometricas.Entidad;

import ejercicioherencia04formasgeometricas.Interfaz.calculosFormas;


public class Circulo implements calculosFormas {
    private Double radio;

    public Circulo() {
    }

    public Circulo(Double radio) {
        this.radio = radio;
    }
  
    //metodos

    @Override
    public void perimetro() {
        Double perimetro = PI*(radio*2);
        System.out.println("--------------------------------");
        System.out.println("el perimetro del Circulo es: "+perimetro);
        System.out.println("--------------------------------");
    }
    

    @Override
    public void area() {
        Double area = PI*(radio*radio);
        System.out.println("--------------------------------");
        System.out.println("el area del circulo es: "+area);
        System.out.println("--------------------------------");
    }
    
    
}
