
package ejercicioexcepciones03divisionnumero;

import java.util.Scanner;


public class EjercicioExcepciones03DivisionNumero {

    
    public static void main(String[] args) {
        DivisionNumero ds = new DivisionNumero();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("dame 2 numeros: ");
        String numero1 = leer.nextLine();
        String numero2 = leer.nextLine();
        
        ds.convertirNumeros(numero1, numero2);
        
    }
    
}
