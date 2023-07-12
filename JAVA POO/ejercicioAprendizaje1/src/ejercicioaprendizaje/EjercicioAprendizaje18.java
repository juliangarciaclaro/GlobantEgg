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
public class EjercicioAprendizaje18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        //definir variables
        int[][] matriz = new int[3][3];
        
        matriz[0][0]=1;
        matriz[0][1]=0;
        matriz[0][2]=4;
        matriz[1][0]=0;
        matriz[1][1]=5;
        matriz[1][2]=0;
        matriz[2][0]=6;
        matriz[2][1]=0;
        matriz[2][2]=-9;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + matriz[i][j]);
                
            }
            System.out.println(" ");
        }
    
        
        System.out.println(" ");
        System.out.println(" ");
        
        
        int[][] matrizTraspuesta = new int[3][3];
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTraspuesta[i][j]=matriz[j][i];
                System.out.print(" " + matrizTraspuesta[i][j]);
                
                
            }
            System.out.println(" ");
        }
        
    }
    
}
