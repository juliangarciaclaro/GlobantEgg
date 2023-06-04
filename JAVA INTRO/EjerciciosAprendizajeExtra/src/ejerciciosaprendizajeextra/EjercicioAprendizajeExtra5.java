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
public class EjercicioAprendizajeExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);

        //definir variables
        String socio;
        int costoT, neto;

        //pedir tipo de socio
        System.out.println("que tipo de socio es A, B o C?");
        socio = leer.nextLine();
        socio = socio.toLowerCase();

        while (!"a".equals(socio) && !"b".equals(socio) && !"c".equals(socio)) {
            System.out.println("ese tipo de socio no existe, vuelva a escribirlo");
            socio = leer.nextLine();
        }

        //pedir costo de tratamiento
        System.out.println("cual es el costo del tratamiento?");
        costoT = leer.nextInt();
        
        switch  (socio){
            case "a":
                neto = (int) (costoT*0.50);
                System.out.println("deberá pagar solo "+neto);
                break;
            case "b":
                neto = (int) (costoT*0.35);
                System.out.println("deberá pagar solo "+neto);
                break;
            case "c":
                System.out.println("deberá pagar el valor completo "+costoT);
        }
                
    }

}
