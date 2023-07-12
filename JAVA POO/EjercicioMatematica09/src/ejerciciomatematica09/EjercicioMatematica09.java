
package ejerciciomatematica09;

import ejerciciomatematica09.Entidad.Matematica;


public class EjercicioMatematica09 {

    public static void main(String[] args) {

        double numero1 = Math.random() * 10;
        double numero2 = Math.random() * 10;
        
        Matematica matematica = new Matematica(numero1,numero2);
        
       double nMayor = matematica.devolverMayor();
        System.out.println("el numero mayor es: "+nMayor);
        System.out.println("-----------------------------");
        
        matematica.calcularPotencia();
        System.out.println("-----------------------------");

        matematica.calculaRaiz();
        System.out.println("-----------------------------");

    }
    
}
