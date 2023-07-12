package ejerciciopersona12.Entidad;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Persona {

    private String nombre;
    private LocalDate fechaNacimiento;

    //constructores
    public Persona() {
    }

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //metodos 
    public Persona crearPersona() {
        Scanner leer = new Scanner(System.in);
        System.out.println("dame el nombre de la persona");
        nombre = leer.nextLine();

        System.out.println("Ingresa la fecha de nacimiento en formato yyyy-mm-dd:");
        String fechaNacimientoStr = leer.nextLine();
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);

        return new Persona(nombre, fechaNacimiento);
    }

    public void calcularEdad() {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = fechaNacimiento.until(fechaActual);
        int edad = periodo.getYears();
        System.out.println("la edad de " + nombre + " es " + edad + " años");

    }

    public boolean menorQue(int edad) {
        LocalDate fechaActual = LocalDate.now();
        Period periodo = fechaNacimiento.until(fechaActual);
        int edadPersona = periodo.getYears();
        return edadPersona < edad;
    }

    public void mostrarPersona() {
        System.out.println(nombre);
        System.out.println(fechaNacimiento);
        
    }    
    
}
