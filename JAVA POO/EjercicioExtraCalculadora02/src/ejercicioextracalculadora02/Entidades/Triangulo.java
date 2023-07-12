
package ejercicioextracalculadora02.Entidades;


public class Triangulo {
    private int ladoA;
    private int base;
    private int ladoC;
    private int altura;
    
    //constructores

    public Triangulo() {
    }

    public Triangulo(int ladoA, int base, int ladoC,int altura) {
        this.ladoA = ladoA;
        this.base = base;
        this.ladoC = ladoC;
        this.altura = altura;
    }
    
    //getters y setters

    public int getLadoA() {
        return ladoA;
    }

    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    public int getBase() {
        return base;
    }

    public void setLadoB(int base) {
        this.base = base;
    }

    public int getLadoC() {
        return ladoC;
    }

    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //metodos
    
    public void perimetro() {
        double perimetro = (double)ladoA+base+ladoC;
        System.out.println("el perimetro del triangulo es: "+perimetro);
        
    }
    
    public void area() {
        double area = (double)(base*altura)/2;
        System.out.println("el area del triangulo es: "+area);
    }
}
