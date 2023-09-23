/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaprendizajecollection05paises;

import ejercicioaprendizajecollection05paises.Servicios.PaisServicios;

/**
 *
 * @author USUARIO
 */
public class EjercicioAprendizajeCollection05Paises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PaisServicios ps = new PaisServicios();
        
        ps.crearPais();
        System.out.println("--------------------------------------");
        ps.mostrarPaisesAlfabeticamente();
        System.out.println("--------------------------------------");
        ps.eliminarPais();
    }
    
}
