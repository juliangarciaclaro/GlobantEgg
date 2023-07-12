package ejerciciooperacion03.Entidad;

public class Operacion {

    private double numero1;
    private double numero2;

    //constructores
    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //getters y setters
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    //funciones y metodos
    public double sumar() {
        double suma = numero1 + numero2;
        return suma;
    }

    public double restar() {
        double resta = numero1 - numero2;
        return resta;
    }

    public double multiplicar() {

        if (numero1 == 0 || numero2 == 0) {
            System.out.println("el valor será 0 porque cualquier numero multiplicado por 0 da 0");
            return 0;

        } else {
            double multiplicacion = numero1 * numero2;
            return multiplicacion;
        }

    }

    public double division() {

        if (numero2 == 0) {
            System.out.println("no se puede hacer la division porque el divisor es 0");
            return 0;
        } else {
            double division = numero1 / numero2;
            return division;
        }

    }
}
