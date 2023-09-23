
package ejercicioherencia01animal;

import ejercicioherencia01animal.Entidades.Animal;
import ejercicioherencia01animal.Entidades.Caballo;
import ejercicioherencia01animal.Entidades.Gato;
import ejercicioherencia01animal.Entidades.Perro;


public class EjercicioHerencia01Animal {

    
    public static void main(String[] args) {
        
        Animal perro = new Perro("Tobby","empanadas",10,"pug");
        perro.alimentarse();
        Animal gato = new Gato("Michi","croquetas",7,"british short-hair");
        gato.alimentarse();
        Animal caballo = new Caballo("Patoco","pasto",15,"percheron");
        caballo.alimentarse();
    }
    
}
