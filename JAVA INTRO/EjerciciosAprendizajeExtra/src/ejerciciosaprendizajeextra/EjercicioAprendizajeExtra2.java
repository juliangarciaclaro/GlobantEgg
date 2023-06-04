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
public class EjercicioAprendizajeExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int A,B,C,D,AUX;
        
        A=1;
        B=2;
        C=3;
        D=4;
           System.out.println("A"+A+"B"+B+"C"+C+"D"+D);
        //logica
        AUX=B;
        B=C;
        C=A;
        A=D;
        D=AUX;
        
           System.out.println("A"+A+"B"+B+"C"+C+"D"+D);
        
        
        
    }
    
}
