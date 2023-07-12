package ejerciciodate11;

import java.util.Date;
import java.util.Scanner;
import java.time.LocalDate;

public class EjercicioDate11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Date fechaActual = new Date();

        System.out.println("dame una fecha en formato dia, mes y año");
        int dia = leer.nextInt();
        int mes = leer.nextInt()-1;
        int anio = leer.nextInt();
        
        Date fecha = new Date(anio-1900, mes, dia);

        System.out.println(fechaActual);
        
        int diferencia = (fechaActual.getYear())-(fecha.getYear());
        
        System.out.println("hay "+diferencia+" años de diferencia entre la fecha actual y la fecha que ingresaste");

        
        
    }

}