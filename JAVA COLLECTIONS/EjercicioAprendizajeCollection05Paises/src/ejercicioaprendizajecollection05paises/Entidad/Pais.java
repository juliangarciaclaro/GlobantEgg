/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaprendizajecollection05paises.Entidad;

/**
 *
 * @author USUARIO
 */
public class Pais {
    private String nombre;
    
    //constructores

    public Pais() {
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }
    
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombre=" + nombre + '}';
    }
    
    
}
