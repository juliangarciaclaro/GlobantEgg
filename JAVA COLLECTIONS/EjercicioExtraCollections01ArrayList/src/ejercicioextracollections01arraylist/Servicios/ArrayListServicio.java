package ejercicioextracollections01arraylist.Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListServicio {

    Scanner leer = new Scanner(System.in);
    private List<Integer> numeros;

    //constructor
    public ArrayListServicio() {
        this.numeros = new ArrayList();
    }

    public void guardarNumeros() {

        boolean braker = true;

        do {
            System.out.println("dame un numero");
            int numero = leer.nextInt();

            if (numero != -99) {
                numeros.add(numero);
            } else {
                braker = false;
            }

        } while (braker);

    }

    public void cantidadNumeros() {
        System.out.println("esta es la cantidad de numeros ");
        System.out.println(numeros.size());

    }

    public void sumaYPromedioNumeros() {
        double sum = 0;
        for (Integer numero : numeros) {
            sum = sum + numero;
        }

        double promedio = (double) sum / numeros.size();
        System.out.println("la suma de los numeros contenidos en la lista es: ");
        System.out.println(sum);
        System.out.println("el promedio de los numeros de la lista es: ");
        System.out.println(promedio);
    }

}
