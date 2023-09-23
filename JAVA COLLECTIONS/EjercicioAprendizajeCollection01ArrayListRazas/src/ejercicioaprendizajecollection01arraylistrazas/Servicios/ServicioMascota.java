/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaprendizajecollection01arraylistrazas.Servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ServicioMascota {

    private List<String> razas;
    private Scanner leer = new Scanner(System.in);
    

    public ServicioMascota() {
        this.razas = new ArrayList();
        
    }

    public void guardarRaza() {
        System.out.println("dame la raza de perro:");
        String raza = leer.nextLine();
        razas.add(raza);
    }
    
   public void removerRaza(String nombre) {
    boolean razaEncontrada = false;
    Iterator<String> iterator = razas.iterator();

    while (iterator.hasNext()) {
        String aux = iterator.next();

        if (aux.equals(nombre)) {
            iterator.remove();
            razaEncontrada = true;
            break; // Salir del bucle si encontramos la raza
        }
    }

    if (razaEncontrada) {
        System.out.println("Raza eliminada correctamente.");
    } else {
        System.out.println("Esa raza no está en la lista.");
    }

    Collections.sort(razas);
    System.out.println(razas.toString());
}

    @Override
    public String toString() {
        return "ServicioMascota{" + "razas=" + razas + '}';
    }

}
