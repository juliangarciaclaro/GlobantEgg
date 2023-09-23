/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaprendizajecollection01arraylistrazas;

import ejercicioaprendizajecollection01arraylistrazas.Servicios.ServicioMascota;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjercicioAprendizajeCollection01ArrayListRazas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        ServicioMascota sm = new ServicioMascota();
        boolean braker = true;
        do {
            System.out.println("que desea hacer?");
            System.out.println("1. guardar raza");
            System.out.println("2. salir");
            System.out.println("dame la opcion que escogiste: ");
            int opcion = leer.nextInt();
            leer.nextLine();
            
            switch  (opcion) {
                
                case 1:
                sm.guardarRaza();
                break;
                
                case 2:
                System.out.println("muchas gracias por utilizar nuestros servicios");
                System.out.println(sm.toString());;
                braker = false;
                break;
                
                default:
                    System.out.println("esa opcion no existe");
                    break;
            }
                    
        } while (braker==true);
        
        
        System.out.println("----------------------------------------");
        System.out.println("dame una raza que desees eliminar:");
        String nombre = leer.nextLine();
        
        sm.removerRaza(nombre);
        
    }
    
}
