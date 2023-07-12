
package ejercicioextracalculadora02.Entidades;


public class Circulo {
    private int radio;

    //constructores

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }
    
    //getter y setter

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    //metodos
    
    public void perimetro() {
        double perimetro = radio*Math.PI*2; 
        System.out.println("el perimetro del circulo es: "+perimetro);
    }
    
    public void area() {
        double area = Math.PI*radio*radio;
        System.out.println("el area del circulo es: "+area);
        
    }
}
