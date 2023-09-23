package ejercicioaprendizajecollection06tienda.Servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductoServicios {

    private Scanner leer = new Scanner(System.in);
    private HashMap<String, Integer> productos;

    //constructor
    public ProductoServicios() {
        this.productos = new HashMap();
    }

    public void ingresarProducto() {
        System.out.println("dame el nombre del producto");
        String nombre = leer.nextLine();
        System.out.println("dame el precio del producto");
        Integer precio = leer.nextInt();
        leer.nextLine();
        productos.put(nombre, precio);
    }

    public void modificarPrecio() {
        System.out.println("dame el nombre del nombre del producto al cual le deseas modificar el precio");
        String nombre = leer.nextLine();
        System.out.println("dame el nuevo precio que deseas darle al producto");
        Integer nuevoPrecio= leer.nextInt();
        leer.nextLine();
        
        boolean braker = productos.containsKey(nombre);
        
        if (braker) {
            productos.replace(nombre, nuevoPrecio);
        }
        
        if(!braker){
            System.out.println("ese producto no esta en la lista ");
        }
       

    }

    public void eliminarProducto() {
        System.out.println("dame el nombre del producto que deseas eliminar");
        String nombre = leer.nextLine();
        boolean braker = productos.containsKey(nombre);
        
        if (braker) {
            productos.remove(nombre);
        }
        
        if (!braker) {
            System.out.println("ese producto no esta en la lista ");
        }
    }

    @Override
    public String toString() {
        return "ProductoServicios{" + "productos=" + productos + '}';
    }

}
