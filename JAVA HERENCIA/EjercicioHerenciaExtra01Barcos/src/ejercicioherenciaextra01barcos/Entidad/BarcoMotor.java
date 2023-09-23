
package ejercicioherenciaextra01barcos.Entidad;

import java.time.LocalDate;


public class BarcoMotor extends Barco{
    
    private Integer potenciaCV;
    
    // constructores

    public BarcoMotor() {
    }

    

    public BarcoMotor(Integer potenciaCV, Integer matricula, Integer eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }
    
    //getter y setter

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return "BarcoMotor{" + "potenciaCV=" + potenciaCV + super.toString()+'}';
    }
    
    
}
