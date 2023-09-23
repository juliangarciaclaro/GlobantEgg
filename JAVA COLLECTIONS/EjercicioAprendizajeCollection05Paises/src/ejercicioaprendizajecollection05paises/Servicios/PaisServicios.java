/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaprendizajecollection05paises.Servicios;

import ejercicioaprendizajecollection05paises.Entidad.Pais;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author USUARIO
 */
public class PaisServicios {

    private Scanner leer = new Scanner(System.in);
    Set<Pais> paises;

    //constructor para el 
    public PaisServicios() {
        this.paises = new HashSet();
    }

    public void crearPais() {
        boolean braker = true;

        do {
            System.out.println("desea crear un pais ?");
            System.out.println("1. SI");
            System.out.println("2. NO");
            int opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("dame el nombre del pais");
                    String nombre = leer.nextLine();
                    paises.add(new Pais(nombre));
                    break;
                case 2:
                    System.out.println("muchas gracias por utilizar nuestros servicios, esta es la lista de paises registrados: ");
                    for (Pais pais : paises) {
                        System.out.println(pais.getNombre());
                    }
                    braker = false;
                    break;
                default:
                    System.out.println("esa opcion no es valida, escriba 1 o 2");
                    break;
            }
        } while (braker == true);

    }

    public void mostrarPaisesAlfabeticamente() {

        List<Pais> listaPaises = new ArrayList<>(paises); // Crear la lista a partir del conjunto actualizado
        Collections.sort(listaPaises, (p1, p2) -> p1.getNombre().compareToIgnoreCase(p2.getNombre()) );
        System.out.println("Esta es la lista de paises ordenados alfabeticamente:");
        listaPaises.forEach(pais -> System.out.println(pais.getNombre()));

    }

    public void eliminarPais() {
        System.out.println("dame el nombre de un pais que desees eliminar de la lista ");
        String nombre = leer.nextLine();
        Iterator<Pais> it = paises.iterator();
        boolean braker = false;
        while (it.hasNext()) {
            String aux = it.next().getNombre();

            if (aux.equals(nombre)) {
                it.remove();
                System.out.println("eliminado!!!");
                System.out.println("esta es la nueva lista");
                for (Pais pais : paises) {
                    System.out.println(pais.toString());
                }
                braker = true;

            }

        }
        if (braker == false) {
            System.out.println("pais no encontrado");
        }

    }

    @Override
    public String toString() {
        return "PaisServicios{" + "paises=" + paises + '}';
    }

}
