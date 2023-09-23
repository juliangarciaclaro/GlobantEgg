package ejercicioaprendizajecollection03alumnos.Servicios;

import ejercicioaprendizajecollection03alumnos.Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioAlumno {

    Scanner leer = new Scanner(System.in);
    List<Alumno> alumnos;

    public ServicioAlumno() {
        this.alumnos = new ArrayList();
    }

    public void crearAlumno() {
        List<Integer> notas = new ArrayList();
        boolean braker = true;

        do {

            System.out.println("quiere agregar a un alumno? ");
            System.out.println("1. SI ");
            System.out.println("2. NO");
            int opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("dame el nombre del alumno");
                    String nombre = leer.nextLine();
                    System.out.println("dame las 3 notas del alumno");
                    int nota1 = leer.nextInt();
                    int nota2 = leer.nextInt();
                    int nota3 = leer.nextInt();
                    leer.nextLine();
                    notas.add(nota1);
                    notas.add(nota2);
                    notas.add(nota3);
                    alumnos.add(new Alumno(nombre, notas));
                    break;
                case 2:
                    System.out.println("adios");
                    braker = false;
                    break;
                default:
                    System.out.println("esa opcion no es valida");
                    break;
            }

        } while (braker == true);

    }

    public void notaFinal() {
        boolean encontrado = false;
        System.out.println("dame el nombre del alumno del que deseas saber su nota final:");
        String nombre = leer.nextLine();

        for (Alumno alumno : alumnos) {
            if (nombre.equals(alumno.getNombre())) {
                int nota1 = alumno.getNotas().get(0);
                int nota2 = alumno.getNotas().get(1);
                int nota3 = alumno.getNotas().get(2);
                double promedio = (double) (nota1 + nota2 + nota3) / 3;

                System.out.println("la nota final de " + nombre + " es " + promedio);
                encontrado = true;
                break;

            }
        }
        if (!encontrado) {
            System.out.println("ese alumno no está en la lista");
        }
    }
}
