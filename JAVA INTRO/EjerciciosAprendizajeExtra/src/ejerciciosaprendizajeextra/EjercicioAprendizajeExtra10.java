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
public class EjercicioAprendizajeExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //definir variables
        int numero1, numero2, resultado,adivinacion;
        
        //logica para los numeros aleatorios 
        numero1 =  (int) (Math.random() * 10);
        numero2 =  (int) (Math.random() * 10);
        
        //el resultado de la multiplicacion de los numeros
        resultado = numero1*numero2;
        
        //pedir un numero para comparar con el resultado
        System.out.println("adivina el resultado de la multiplicacion de los numeros aleatorios ");
        adivinacion = leer.nextInt();
        
        //bucle para que siga pidiendo el resultado hasta que adivine el resultado correcto
       while    (adivinacion!=resultado) {
           System.out.println("ese numero no es, intenta de nuevo");
           adivinacion = leer.nextInt();
           
       }
        
        System.out.println("correcto!!! el resultado es: "+adivinacion);
        
        
        
        
    }
    
}
