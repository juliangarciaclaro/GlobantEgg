package ejerciciorectangulo04.Rectangulo;

import java.util.Scanner;

public class Rectangulo {

    private double base;
    private double altura;

//constructores
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //getters y setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //metodos y funciones 
    Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        System.out.println("dame la base del rectangulo");
        double base = leer.nextDouble();
        System.out.println("dame la altura del rectangulo");
        double altura = leer.nextDouble();
        return new Rectangulo(base, altura);
    }
    
    public double superficie() {
        double superficie = base*altura;
        return superficie;
    }
    
    public double perimetro(){
        double perimetro = (base+altura)*2;
        return perimetro;
    }
    
   
    public void graficar(){
        
         for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == base - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
    

