/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizajeextra;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjercicioAprendizajeExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //definir variables
        int dividendo, divisor,cociente,residuo;
        cociente = 0;
        
        System.out.println("dame dos numeros");
        dividendo = leer.nextInt();
        divisor = leer.nextInt();
        
        do {
            residuo = dividendo-divisor;
            cociente++;
            dividendo= residuo;
            
        } while (residuo>divisor);
        
        System.out.println("residuo: "+residuo+" cociente: "+cociente);
    }
    
}
