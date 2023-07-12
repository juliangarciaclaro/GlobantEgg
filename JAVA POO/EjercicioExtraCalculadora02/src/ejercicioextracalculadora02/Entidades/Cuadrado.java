/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextracalculadora02.Entidades;

/**
 *
 * @author USUARIO
 */
public class Cuadrado {
    private int lado;
    
    //constructores

    public Cuadrado() {
    }

    public Cuadrado(int lado) {
        this.lado = lado;
    }
    
    //getter y setter

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    //metodos
    
    public void perimetro(){
        double perimetro = (double)lado*4;
        System.out.println("el perimetro del cuadrado es: "+perimetro);
    }
    
    public void area() {
        double area = (double) lado*lado;
        System.out.println("el area del cuadrado es: "+area);
    }
}
