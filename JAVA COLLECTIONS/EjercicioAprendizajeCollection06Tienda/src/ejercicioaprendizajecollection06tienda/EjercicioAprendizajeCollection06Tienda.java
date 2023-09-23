
package ejercicioaprendizajecollection06tienda;

import ejercicioaprendizajecollection06tienda.Servicios.ProductoServicios;
import java.util.Scanner;

public class EjercicioAprendizajeCollection06Tienda {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ProductoServicios ps = new ProductoServicios();
        boolean braker = true;
        
        do {
            System.out.println("Que accion deseas realizar:");
            System.out.println("1. crear productos");
            System.out.println("2. modificar precios");
            System.out.println("3. eliminar productos");
            System.out.println("4. ver todos los productos");
            System.out.println("5. salir");
            
            int opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    ps.ingresarProducto();
                    break;
                case 2:
                    ps.modificarPrecio();
                    break;
                case 3:
                    ps.eliminarProducto();
                    break;
                case 4:
                    System.out.println("esta es la lista de productos:");
                    System.out.println(ps.toString());
                    break;
                case 5:
                    System.out.println("adios!!!");
                    braker= false;
                    break;
            }
        } while (true);
        
    }
    
}
