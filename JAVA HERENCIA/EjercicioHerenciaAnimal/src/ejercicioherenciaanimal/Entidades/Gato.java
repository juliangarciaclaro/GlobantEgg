/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherenciaanimal.Entidades;

/**
 *
 * @author USUARIO
 */
public class Gato extends Animal {

    public Gato() {
    }

    public Gato(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerRuido(){
        System.out.println("miau miau");
    }
     
}
