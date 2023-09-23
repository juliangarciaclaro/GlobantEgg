package ejercicioherencia04formasgeometricas.Entidad;

import ejercicioherencia04formasgeometricas.Interfaz.calculosFormas;

public class Rectangulo implements calculosFormas {

    private Double base;
    private Double altura;

    public Rectangulo() {
    }

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void perimetro() {
        Double perimetro = (base*altura)*2;
        System.out.println("--------------------------------");
        System.out.println("el perimetro del rectangulo es: "+perimetro);
        System.out.println("--------------------------------");
    }

    @Override
    public void area() {
        Double area = base*altura;
        System.out.println("--------------------------------");
        System.out.println("el area del rectangulo es: "+area);
        System.out.println("--------------------------------");
    }

}
