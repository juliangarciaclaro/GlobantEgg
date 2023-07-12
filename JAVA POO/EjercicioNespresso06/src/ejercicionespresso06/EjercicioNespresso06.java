package ejercicionespresso06;

import ejercicionespresso06.Cafetera.Cafetera;
import java.util.Scanner;

public class EjercicioNespresso06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        //llamar clase y crear metodo
       Cafetera cs = new Cafetera();
        
       //crear objeto (instanciar)
       Cafetera cafetera1 = cs.crearcafetera();
       
       //llenar cafetera con el faltante de cafe
       cafetera1.llenarCafetera();
       
       // llenar taza de cafe
        System.out.println("de cuantos mililitros desea una taza de cafe?");
        int taza = leer.nextInt();
        
        cafetera1.servirTaza(taza);
        
        //vaciar la cafetera
        cafetera1.vaciarCafetera();
        
        //agregar cafe
        System.out.println("cuantos mililitros de cafe desea agregar a la cafetera?");
        int cantidadCafe = leer.nextInt();
        
        cafetera1.agregarCafe(cantidadCafe);
        
       
    }

}
