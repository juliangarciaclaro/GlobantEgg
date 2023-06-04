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
public class EjercicioAprendizajeExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
               System.out.println("VERSION CON BUCLE WHILE");
        System.out.println("==========================="); 
        //definir variables
        double n, valor, vmaximo, vminimo, promn, cont;
        cont = 1;
      
        //pedir cantidad de numeros
        System.out.println("dame la cantidad de numeros");
        n = leer.nextDouble();
        System.out.println("dame un valor");
        valor = leer.nextDouble();
        vminimo = valor;
        vmaximo = valor;
        promn= valor;
        //logica
        while  (cont<n) {
          System.out.println("dame un valor");
          valor = leer.nextDouble();
          promn+=valor;
          
            if (valor<vminimo) {
                vminimo=valor;
            }
            
            if (valor>vmaximo) {
                vmaximo=valor;
            }
            
            cont++;
          
        }
        
        System.out.println("el valor maximo es: "+vmaximo);
        System.out.println("el valor minimo es: "+vminimo);
        System.out.println("el promedio de valores es: "+(promn/n));
        
        
        System.out.println("VERSION CON BUCLE DO-WHILE");
        System.out.println("===========================");
        
        //definir variables
          double nb, valorb, vmaximob, vminimob, promnb, contb;
        contb=1;
      
        
        //pedir cantidad de valores
        System.out.println("dame la cantidad de valores");
        nb = leer.nextDouble();
        
        System.out.println("dame un valor");
        valorb = leer.nextDouble();
        vminimob = valorb;
        vmaximob = valorb;
        promnb= valorb;
        
        do {
              System.out.println("dame un valor");
          valorb = leer.nextDouble();
          promnb+=valorb;
          
            if (valorb<vminimob) {
                vminimob=valorb;
            }
            
            if (valorb>vmaximob) {
                vmaximob=valorb;
            }
            
            contb++;
            
        } while (contb<nb);
        
        System.out.println("el valor maximo es: "+vmaximob);
        System.out.println("el valor minimo es: "+vminimob);
        System.out.println("el promedio de valores es: "+(promnb/nb));
        
    }
    
}
