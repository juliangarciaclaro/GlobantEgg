/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherenciaanimal.Entidades;


public class Perro extends Animal{

    public Perro() {
    }

    public Perro(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerRuido(){
        
        System.out.println("guau guau");
    }
}
