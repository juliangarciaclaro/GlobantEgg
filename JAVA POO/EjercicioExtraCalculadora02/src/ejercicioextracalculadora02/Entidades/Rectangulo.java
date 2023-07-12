
package ejercicioextracalculadora02.Entidades;


public class Rectangulo {
    private int base;
    private int altura;
    
    //constructores

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //getters y setters

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //metodos
    
    public void perimetro() {
        double perimetro = (double)2*(base+altura);
        System.out.println("el primetro del rectangulo es: "+perimetro);
    }
    
    public void area() {
        double area = (double)base*altura;
        System.out.println("el area del rectangulo es: "+area);
    }
}
