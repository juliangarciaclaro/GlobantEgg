package ejerciciotienda14.Entidad;

import java.util.Arrays;
import java.util.Scanner;

public class Movil {

    private String marca;
    private String modelo;
    private int precio;
    private int memoriaRam;
    private int almacenamiento;
    private int[] codigo;

    //constructores
    public Movil() {
    }

    public Movil(String marca, String modelo, int precio, int memoriaRam, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    //getters y setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    //metodos
    public int[] ingresarCodigo() {
        Scanner leer = new Scanner(System.in);
        codigo = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("dame el numero " + (i + 1));
            codigo[i] = leer.nextInt();
        }
        return codigo;
    }

    public Movil cargarCelular() {
        Scanner leer = new Scanner(System.in);
        System.out.println("dame la marca del celular");
        marca = leer.nextLine();
        System.out.println("dame el modelo del celular");
        modelo = leer.nextLine();
        System.out.println("dame el precio del celular");
        precio = leer.nextInt();
        System.out.println("dame la memoria Ram del celular");
        memoriaRam = leer.nextInt();
        System.out.println("dame el almacenamiento del celular");
        almacenamiento = leer.nextInt();
        codigo = ingresarCodigo();
        
        return new Movil(marca, modelo, precio, memoriaRam, almacenamiento, codigo);
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", memoriaRam=" + memoriaRam + ", almacenamiento=" + almacenamiento + ", codigo=" + Arrays.toString(codigo) + '}';
    }

    
}
