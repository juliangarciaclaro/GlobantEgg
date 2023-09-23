
package ejercicioherenciaextra01barcos.Entidad;

import java.time.LocalDate;


public class Velero extends Barco {
    private Integer mastiles;
    
    //constructores

    public Velero() {
    }


    public Velero(Integer mastiles, Integer matricula, Integer eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.mastiles = mastiles;
    }
    //getter y setter

    public Integer getMastiles() {
        return mastiles;
    }

    public void setMastiles(Integer mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "Velero{" + "mastiles=" + mastiles + super.toString()+ '}';
    }

    
}
