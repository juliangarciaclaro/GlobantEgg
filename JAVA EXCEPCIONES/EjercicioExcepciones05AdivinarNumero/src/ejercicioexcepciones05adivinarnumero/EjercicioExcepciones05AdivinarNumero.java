package ejercicioexcepciones05adivinarnumero;

import java.util.Random;
import java.util.Scanner;

public class EjercicioExcepciones05AdivinarNumero {

    public static void main(String[] args) {

         Random random = new Random();
        int numeroAdivinar = random.nextInt(500) + 1;
        int intentos = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Adivina un número entre 1 y 500.");

        while (true) {
            try {
                System.out.print("Introduce tu intento: ");
                int intento = scanner.nextInt();
                intentos++;

                if (intento < 1 || intento > 500) {
                    System.out.println("Por favor, ingresa un número en el rango de 1 a 500.");
                } else if (intento < numeroAdivinar) {
                    System.out.println("El número a adivinar es mayor.");
                } else if (intento > numeroAdivinar) {
                    System.out.println("El número a adivinar es menor.");
                } else {
                    System.out.println("¡Felicidades! Has adivinado el número " + numeroAdivinar + " en " + intentos + " intentos.");
                    break;
                }
            } catch (Exception e) {
                System.out.println("Entrada no válida. Por favor, ingresa un número válido.");
                scanner.next(); // Limpiar el búfer del scanner
                intentos++;
            }
        }

        scanner.close();
    }

}
