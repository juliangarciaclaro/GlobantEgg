
package ejercicioherenciaextra01barcos.Entidad;

import java.time.LocalDate;


public class BarcoLujo extends Barco{
    
    private Integer potenciaCV;
    private Integer camarotes;
    
    //constructores

    public BarcoLujo() {
    }


    public BarcoLujo(Integer potenciaCV, Integer camarotes, Integer matricula, Integer eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.potenciaCV = potenciaCV;
        this.camarotes = camarotes;
    }
    
    //getters y setters

    public Integer getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public Integer getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(Integer camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "BarcoLujo{" + "potenciaCV=" + potenciaCV + ", camarotes=" + camarotes + super.toString()+'}';
    }
    
    
    
}
