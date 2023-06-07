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
public class EjercicioAprendizajeExtra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        //definir variables
        int numero1, numero2, opcion;
        
        //pedir numeros 
        System.out.println("dame dos numeros");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();
        
        //hacer calculadora
        
        do {
            
            System.out.println("escoja una de las siquientes opciones:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. SALIR");
            
            opcion = leer.nextInt();
            
            switch  (opcion){
                case 1:
                    System.out.println("la suma de los numeros es: "+sumar(numero1,numero2));      
                    break;
                case 2:
                    System.out.println("la resta de los numeros es: "+resta(numero1,numero2));
                    break;
                case 3:
                    System.out.println("la multiplicacion de los numeros es: "+multiplicacion(numero1,numero2));
                    break;
                case 4: 
                    System.out.println("la division de los numeros es: "+division(numero1,numero2));
                    break;
                case 5:
                    System.out.println("hasta luego");
                    break;
                    
            }
            
            if (opcion==5) {
                break;
                
            }
            
        } while (true);
        
    }
    
    public static int sumar(int numero1, int numero2){
        int suma;
        suma = numero1+numero2;
        return suma;
    }
    
    public static int resta(int numero1, int numero2){
        int resta;
        resta = numero1 - numero2;
        return resta;
    }
    
    public static int multiplicacion(int numero1, int numero2){
        int multiplica;
        multiplica = numero1*numero2;
        return multiplica;
    }
    
    public static double division(int numero1, int numero2){
        double division;
        division = (double) (numero1/numero2);
        return division;
    }

}
