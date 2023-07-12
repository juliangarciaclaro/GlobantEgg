package ejercicionespresso06.Cafetera;

import java.util.Scanner;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    //constructores
    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    // getters y setters
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    // metodos 
    Scanner leer = new Scanner(System.in);

    //crear cafetera
    public Cafetera crearcafetera() {
        System.out.println("dame la capacidad maxima de la cafetera");
        capacidadMaxima = leer.nextInt();
        do {
            System.out.println("dame la cantidad actual de cafe que contiene la cafetera");
            cantidadActual = leer.nextInt();
        } while (cantidadActual > capacidadMaxima);

        return new Cafetera(capacidadMaxima, cantidadActual);
    }

    //llenar cafetera
    public int llenarCafetera() {
        if (capacidadMaxima == cantidadActual) {
            System.out.println("la cafetera ya esta llena");
            return cantidadActual;
        } else {
            cantidadActual = capacidadMaxima;
            return cantidadActual;
        }
    }

    //servir una taza de cafe
    public int servirTaza(int taza) {
        if (taza <= cantidadActual) {
            cantidadActual -= taza;
            return cantidadActual;
        } else {
            taza = cantidadActual;
            cantidadActual = 0;
            System.out.println("la taza no se llenó completamente, y ésta solo contiene: " + taza + " mililitros de cafe");
            return cantidadActual;
        }
    }

    //vaciar cafetera
    public int vaciarCafetera() {
        cantidadActual = 0;
        return cantidadActual;
    }
    
    //agregar cafe a la cafetera
    
    public void agregarCafe(int cantidadCafe) {
        if (cantidadActual+cantidadCafe > capacidadMaxima) {
            System.out.println("la cantidad de cafe excede la capacidad maxima de la cafetera");
            
        }else {
            cantidadActual+=cantidadCafe;
        }
    }

}
