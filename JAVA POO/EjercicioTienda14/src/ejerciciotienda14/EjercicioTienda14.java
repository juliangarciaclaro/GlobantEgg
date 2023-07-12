
package ejerciciotienda14;

import ejerciciotienda14.Entidad.Movil;
import java.util.Scanner;

public class EjercicioTienda14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Movil ms = new Movil();
        
        System.out.println("cuantos celulares desea ingresar al sistema ?");
        int qCelulares = leer.nextInt();
        Movil[] movil = new Movil[qCelulares];
        
        for (int i = 0; i < qCelulares; i++) {
            movil[i] = ms.cargarCelular();
        }
        
        System.out.println("los celulares ingresados son:");
        System.out.println("");
        
        for (int i = 0; i < qCelulares; i++) {
            System.out.println(movil[i].toString());
            System.out.println("-------------------------------");
        }
        
    }
    
}
