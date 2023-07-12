package ejericiovectores13.Entidad;

import java.util.Scanner;

public class Curso {

    private String nombre;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private int precioHora;
    private String[] alumnos;

    //constructores
    public Curso() {
    }

    public Curso(String nombre, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, int precioHora, String[] alumnos) {
        this.nombre = nombre;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioHora = precioHora;
        this.alumnos = alumnos;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(int precioHora) {
        this.precioHora = precioHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    //metodos
    Scanner leer = new Scanner(System.in);

    public String[] cargarAlumnos() {
        alumnos = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("nombre del alumno");
            alumnos[i] = leer.nextLine();
        }
        return alumnos;
    }

    public Curso crearCurso() {
        System.out.println("dame el nombre del curso");
        String nombre = leer.nextLine();
       
        System.out.println("dame la cantidad de horas por dia del curso");
        int cantidadHorasPorDia = leer.nextInt();
        
        System.out.println("dame la cantidad de dias por semana del curso");
        int cantidadDiasPorSemana = leer.nextInt();
       leer.nextLine();
        System.out.println("dame el turno (temprano o tarde) del curso");
        String turno = leer.nextLine();
        
        while (!"tarde".equals(turno) && !"temprano".equals(turno) ) {
            System.out.println("solo puede ser temprano o tarde vuelve a escribirlo");
            turno = leer.nextLine();
        }
      
        System.out.println("dame el precio por hora del curso");
        int precioHora = leer.nextInt();
        leer.nextLine();
        
        System.out.println("dame el nombre de los alumnos del curso");
        String[] alumnos = cargarAlumnos();
        leer.close();

        return new Curso(nombre, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioHora, alumnos);

    }

    public void calcularGananciaSemanal() {
        int ganancia = cantidadHorasPorDia * precioHora * alumnos.length * cantidadDiasPorSemana;
        System.out.println("la ganancia semanal es: " + ganancia + " pesos");
    }
}
