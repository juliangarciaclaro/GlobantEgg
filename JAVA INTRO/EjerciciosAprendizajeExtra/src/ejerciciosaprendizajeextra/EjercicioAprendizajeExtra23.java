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
import java.util.Scanner;

public class EjercicioAprendizajeExtra23 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // Crear arreglo para almacenar las palabras ingresadas por el usuario
        String[] palabras = new String[5];

        System.out.println("Ingrese 5 palabras de 3 a 5 caracteres:");
        // Leer las palabras ingresadas por el usuario y validar su longitud
        for (int i = 0; i < 5; i++) {
            palabras[i] = leer.nextLine();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener entre 3 y 5 caracteres. Ingrese nuevamente:");
                palabras[i] = leer.nextLine();
            }
        }

        // Crear matriz para la sopa de letras
        char[][] sopaDeLetras = new char[20][20];

        // Rellenar la sopa de letras con números aleatorios
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopaDeLetras[i][j] = generarNumeroAleatorio();
            }
        }

        // Ubicar las palabras en filas diferentes de manera aleatoria
        for (String palabra : palabras) {
            // Seleccionar una fila aleatoria para la palabra
            int filaAleatoria = (int) (Math.random() * 20);
            // Seleccionar una columna inicial aleatoria dentro del rango permitido para la palabra
            int columnaInicial = (int) (Math.random() * (20 - palabra.length() + 1));
            // Colocar la palabra en la sopa de letras
            for (int j = 0; j < palabra.length(); j++) {
                if (columnaInicial + j < 20) {
                    sopaDeLetras[filaAleatoria][columnaInicial + j] = palabra.charAt(j);
                } else {
                    break;
                }
            }
        }

        // Imprimir la sopa de letras por pantalla
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopaDeLetras[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Generar un número aleatorio del 0 al 9 y convertirlo a carácter
    public static char generarNumeroAleatorio() {
        int numeroAleatorio = (int) (Math.random() * 10);
        return (char) (numeroAleatorio + '0');
    }
}