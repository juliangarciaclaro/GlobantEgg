/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosaprendizajeextra;
import static java.lang.Math.floor;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class EjerciciosAprendizajeExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //definir variables
        int dias,horas, minutos ;
       
        
        //pedir cantidad de minutos
        System.out.println("dame la cantidad de minutos que deseas convertir");
        minutos = leer.nextInt();
        
        //logica 
        if (minutos>1440) {
             dias = (int) floor(minutos/1440);
             if ((minutos/60)>24) {
                horas = (int) floor(minutos/60)-24;
            }else {
                 horas = 0;
             }
            System.out.println("dias: "+dias+" horas: "+horas);
        }else{
            horas = (int) floor(minutos/60);
            System.out.println("horas: "+horas);
        }
       
    }
    
}
