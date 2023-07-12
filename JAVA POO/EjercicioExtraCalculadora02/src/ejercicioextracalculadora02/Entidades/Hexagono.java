
package ejercicioextracalculadora02.Entidades;


public class Hexagono {
    private int lado;
    private int apotema;
    private double perimetro;
    
    //constructores

    public Hexagono() {
    }


    public Hexagono(int lado, int apotema) {
        this.lado = lado;
        this.apotema = apotema;
    }
    
    //getters y setters

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getApotema() {
        return apotema;
    }

    public void setApotema(int apotema) {
        this.apotema = apotema;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    //metodos
    
    public void perimetro() {
        perimetro = lado*6;
        System.out.println("el perimetro del hexagono es: "+perimetro);
    }
    
    public void area() {
        double area = (perimetro*apotema)/2;
        System.out.println("el area del hexagono es: "+area);
        
    }
    
}
