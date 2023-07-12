/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomatematica09.Entidad;

import static java.lang.Double.max;
import static java.lang.Math.round;

/**
 *
 * @author USUARIO
 */
public class Matematica {
    private double numero1;
    private double numero2;
    
    //constructores

    public Matematica() {
    }

    public Matematica(double numero1, double numero2) {
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
    
    // metodos 
    
    public double devolverMayor() {
        double mayor = Math.max(numero1,numero2);
        return mayor;
        
    }
    
    public void calcularPotencia() {
        
        if (numero1>numero2) {
            long resultado = round(numero1)*round(numero1);
            System.out.println("la potencia del numero mayor es: "+resultado);
        }else {
            long resultado = round(numero2)*round(numero2);
            System.out.println("la potencia del numero mayor es: "+resultado);
        }
        
    }
    
    public void calculaRaiz() {
        
        if (numero1<numero2) {
            double r2 =Math.sqrt(Math.abs(numero1)); 
            System.out.println("la raiz cuadrada del numero menor es: "+r2);
        } else {
            double r2 =Math.sqrt(Math.abs(numero2));
            System.out.println("la raiz cuadrada del numero menor es: "+r2);
        }
    }
    
}
