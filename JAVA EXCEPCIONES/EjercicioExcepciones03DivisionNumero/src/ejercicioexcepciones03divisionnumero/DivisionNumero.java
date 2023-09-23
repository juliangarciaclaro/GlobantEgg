/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexcepciones03divisionnumero;

import static java.lang.Integer.parseInt;
import java.util.InputMismatchException;

/**
 *
 * @author USUARIO
 */
public class DivisionNumero {
    
    public void convertirNumeros(String numero1, String numero2){
        
        try {
        int n1 = parseInt(numero1);
        int n2 = parseInt(numero2);
        
        int resultado = n1/n2;
        
            System.out.println("el resultado es: "+resultado);
        } catch (InputMismatchException e){
            System.out.println(" el tipo de valor que intenta ingresar no es de tipo entero");
        } catch (NumberFormatException e){
            System.out.println("digitó caracteres que no son numeros");
        } catch (ArithmeticException e){
            System.out.println("no puede dividir un numero en 0");
        }
        
        
      
    }
    
    
}
