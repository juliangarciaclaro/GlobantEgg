/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaprendizajecollection03alumnos;


import ejercicioaprendizajecollection03alumnos.Servicios.ServicioAlumno;

/**
 *
 * @author USUARIO
 */
public class EjercicioAprendizajeCollection03Alumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ServicioAlumno sa = new ServicioAlumno();
        
        sa.crearAlumno();
        
        sa.notaFinal();
    }
    
}
