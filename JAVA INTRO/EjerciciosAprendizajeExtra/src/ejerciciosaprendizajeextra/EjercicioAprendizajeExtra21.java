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
public class EjercicioAprendizajeExtra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //definir variables
        int aprobado, reprobado;
        double[] vector = new double[10];
        aprobado=0;
        reprobado=0;
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("dame las notas del alumno"+(i+1));
            
            //se piden las notas y se evalua que sean del 1 al 10
            System.out.println("nota del primer trabajo practico");
            double tpractico1 = leer.nextDouble();
            
            while  (tpractico1<1 || tpractico1>10){
                System.out.println("debe ser de 1 a 10");
                tpractico1 = leer.nextDouble();
            }
            System.out.println("nota del segundo trabajo practico");
            double tpractico2 = leer.nextDouble();
           
            while  (tpractico2<1 || tpractico2>10){
                System.out.println("debe ser de 1 a 10");
                tpractico2 = leer.nextDouble();
            }
            System.out.println("nota del primer integrador");
            double integrador1 = leer.nextDouble();
          
            while  (integrador1<1 || integrador1>10){
                System.out.println("debe ser de 1 a 10");
                integrador1 = leer.nextDouble();
            }
            System.out.println("nota del segundo integrador");
            double integrador2 = leer.nextDouble();
            
               while  (integrador2<1 || integrador2>10){
                System.out.println("debe ser de 1 a 10");
                integrador2 = leer.nextDouble();
            }
            
            //se calcula la nota final que es la sumatoria de las notas con un ponderamiento especial para cada una
            double notafinal = (tpractico1*0.1+tpractico2*0.15+integrador1*0.25+integrador2*0.5);
            
            //se contabilizan los alumnos que aprobaron o reprobaron
            if (notafinal>=7) {
                aprobado++;
                
            }else {
                reprobado++;
            }
            
            //se almacena en un vector la nota final de cada alumno
            vector[i] = notafinal;
            
        }
        
        //se imprime el vector
        System.out.print("vector de notas: " );
        for (int i = 0; i < 10; i++) {
            System.out.print("["+vector[i]+"]");
            
        }
        
        //se muestra la cantidad de parobados y reprobados
        System.out.println("");
        System.out.println("alumnos que aprobaron: "+aprobado);
        System.out.println("alumnos que reprobaron: "+reprobado);
    }
    
}
