/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaprendizaje;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class EjercicioAprendizaje17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        //definir variables
        int[] vector = {2,10,435,58403,45,433,573,2344,2,23,435};
        int digito1 = 0;
        int digito2 = 0;
        int digito3 = 0;
        int digito4 = 0;
        int digito5 = 0;
       
       
        //bucle que recorre todo el vector y realiza un switch para evaluar el valor que trae la funcion que determina
        //la cantidad de digitos del numero y a su vez cuenta la cantidad de numeros que poseen n digitos
        for (int numero:vector) {
            
            switch  (contadordigitos(numero)){
                case 1:
                    digito1+=1;
                    break;
                case 2:
                    digito2+=1;
                    break;
                case 3:
                    digito3+=1;
                    break;
                case 4:
                    digito4+=1;
                    break;
                case 5:
                    digito5+=1;
                    break;
                           
            }
                
            
        }
        System.out.println("hay " + digito1 + " numeros de 1 digito");
        System.out.println("hay " + digito2 + " numeros de 2 digitos");
        System.out.println("hay " + digito3 + " numeros de 3 digitos");
        System.out.println("hay " + digito4 + " numeros de 4 digitos");
        System.out.println("hay " + digito5 + " numeros de 5 digitos");
    }
    
    
    
    //funcion para contar los digitos que tiene el numero almacenado en el vector
    public static int contadordigitos(int numero){
      int contador = 0;
        
        if (numero==0) {
            return  1;
        }
        
        while(numero!=0){
            numero = numero/10;
            contador+=1;
        }
     
        return contador;
    
        
    }
        

}


