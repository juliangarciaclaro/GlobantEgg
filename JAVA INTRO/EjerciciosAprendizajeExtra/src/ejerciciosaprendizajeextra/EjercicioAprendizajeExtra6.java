/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizajeextra;
import java.util.Scanner;

public class EjercicioAprendizajeExtra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int personas, contM, contG;
        double promM, promG, altura;
        promM = 0;
        promG = 0;
        contM = 0;
        contG = 0;
        
        System.out.println("¿Cuántas personas serán evaluadas?");
        personas = leer.nextInt();
        
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona #" + (i + 1));
            altura = leer.nextDouble();
            
            promG += altura;
            contG++;
            
            if (altura < 1.6) {
                promM += altura;
                contM++;
            }
        }
        
        if (contG != 0) {
            promG /= contG;
        }
        
        if (contM != 0) {
            promM /= contM;
        }
        
        System.out.println("El promedio de altura general es: " + promG);
        System.out.println("El promedio de altura menor a 1.60 es: " + promM);
    }
}
