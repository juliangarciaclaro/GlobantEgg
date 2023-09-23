
package ejercicioherenciaextra01barcos.Servicio;

import ejercicioherenciaextra01barcos.Entidad.Alquiler;
import ejercicioherenciaextra01barcos.Entidad.Barco;
import ejercicioherenciaextra01barcos.Entidad.BarcoLujo;
import ejercicioherenciaextra01barcos.Entidad.BarcoMotor;
import ejercicioherenciaextra01barcos.Entidad.Velero;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class AlquilerServicio {
    
    VeleroServicio vs = new VeleroServicio();
    BarcoMotorServicio bms = new BarcoMotorServicio();
    BarcoLujoServicio bls = new BarcoLujoServicio();
    
    
    public Alquiler crearAlquiler(){
        Scanner leer = new Scanner(System.in);
        System.out.println("dame tu nombre");
        String nombre = leer.nextLine();
        System.out.println("dame la fecha de alquiler en formato \"yyyy-MM-dd\": ");
        String fechaalquilerStr = leer.nextLine();
        LocalDate fechaAlquiler = LocalDate.parse(fechaalquilerStr);
        System.out.println("dame la fecha de devolucion en formato \"yyyy-MM-dd\"");
        String fechadevolucionStr = leer.nextLine();
        LocalDate fechaDevolucion = LocalDate.parse(fechadevolucionStr);
        
        String tipo;
        do {
              System.out.println("que barco desea alquilar? velero/motor/lujo, si escoje otra opcion debera volver a escribir una opcion válida");
               tipo = leer.nextLine();
        
        } while (!tipo.equalsIgnoreCase("velero") && !tipo.equalsIgnoreCase("motor") && !tipo.equalsIgnoreCase("lujo"));
        
        String tipoBarco = tipo.toLowerCase();
        Barco barco = new Barco();
        switch  (tipoBarco) {
            case "velero" :
               barco = vs.crearVelero();
                break;
            case "motor":
               barco = bms.crearBarcoMotor();
                break;
            case "lujo":
               barco = bls.crearBarcoLujo();
                break;     
        }
        System.out.println("dame tu DNI");
        Integer DNI = leer.nextInt();
        
        System.out.println("dame la posicion del amarre");
        Integer posicion = leer.nextInt();
        
        return new Alquiler(nombre,DNI,fechaAlquiler,fechaDevolucion,posicion,barco);
        
    }
    
    public void precioFinal(Alquiler alquiler){
        Integer diasAlquilados = (int) ChronoUnit.DAYS.between(alquiler.getFechaAlquiler(),alquiler.getFechaDevolucion());
        
        Integer valorModulo=0;
        if (alquiler.getBarco() instanceof Velero) {
            Velero velero = (Velero) alquiler.getBarco();
            valorModulo = (10*velero.getEslora())+velero.getMastiles();
            
        }
        
        if (alquiler.getBarco() instanceof BarcoMotor) {
            BarcoMotor motor = (BarcoMotor) alquiler.getBarco();
            valorModulo = (10*motor.getEslora())+motor.getPotenciaCV();
            
        }
        
        if (alquiler.getBarco() instanceof BarcoLujo) {
            BarcoLujo lujo = (BarcoLujo) alquiler.getBarco();
            valorModulo = (10*lujo.getEslora())+lujo.getPotenciaCV()+lujo.getCamarotes();
            
        }
        
        Integer precioFinal = diasAlquilados*valorModulo;
        
        System.out.println("el valor que debera pagar por ese alquiler es :"+precioFinal);
        
    }
    
    
}
