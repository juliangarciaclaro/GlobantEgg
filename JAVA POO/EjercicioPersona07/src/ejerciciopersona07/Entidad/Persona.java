package ejerciciopersona07.Entidad;

import java.util.Scanner;

public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    //constructores
    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //METODOS
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //metodo para crear persona
    public Persona crearPersona() {
        System.out.println("dame el nombre de la persona");
        nombre = leer.nextLine();

        System.out.println("dame la edad de la persona");
        edad = leer.nextInt();
        leer.nextLine();

        System.out.println("dame el genero de la persona");
        sexo = leer.nextLine();

        while (!"O".equals(sexo) && !"M".equals(sexo) && !"H".equals(sexo)) {
            System.out.println("solo es valido 'H', 'M' o 'O', asi que vuelve a escribirlo");
            sexo = leer.nextLine();
            
        }

        System.out.println("dame peso de la persona");
        peso = leer.nextDouble();

        System.out.println("dame la altura de la persona en metros");
        altura = leer.nextDouble();
        leer.nextLine();

        return new Persona(nombre, edad, sexo, peso, altura);

    }

    //metodo para calcular IMC
    public int calcularIMC() {
        double IMC = (peso / (altura * altura));
        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    //metodo para saber si la persona es mayor de edad
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

}
