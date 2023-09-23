
package ejercicioherenciaextra02edificio;

import ejercicioherenciaextra02edificio.Entidad.Edificio;
import ejercicioherenciaextra02edificio.Entidad.EdificioDeOficinas;
import ejercicioherenciaextra02edificio.Entidad.Polideportivo;
import java.util.ArrayList;


public class EjercicioHerenciaExtra02Edificio {

    
    public static void main(String[] args) {
        
        ArrayList <Edificio> edificios = new ArrayList();
        
        Edificio poli1 = new Polideportivo("juan garcia","techado",100.0,20.0,300.0);
        Edificio poli2 = new Polideportivo("doris claro","abierto",70.0,35.0,400.0);
        Edificio edif1 = new EdificioDeOficinas (3,50,10,20.0,3.0,20.0);
        Edificio edif2 = new EdificioDeOficinas (5,30,7,20.0,3.0,15.0);
        
        edificios.add(poli1);
        edificios.add(poli2);
        edificios.add(edif1);
        edificios.add(edif2);
        
        for (Edificio edificio : edificios) {
            System.out.println("-----------------------------------------");
            if (edificio instanceof Polideportivo) {
                Polideportivo poli = (Polideportivo) edificio;
                poli.calcularSuperficie();
                poli.calcularVolumen();
                if (poli.getTipoInstalacion().equalsIgnoreCase("techado")) {
                    System.out.println("el polideportivo es techado");
                } else{
                    System.out.println("el polideportivo es cubierto");
                }
            }
            
            if (edificio instanceof EdificioDeOficinas) {
                EdificioDeOficinas edif = (EdificioDeOficinas) edificio;
                edif.calcularSuperficie();
                edif.calcularVolumen();
                edif.cantPersonas();
            }
            System.out.println("-----------------------------------------");
        }
    }
    
}
