
package ejercicioherencia02electrodomesticos.Entidad;

import ejercicioherencia02electrodomesticos.Enum.Color;
import ejercicioherencia02electrodomesticos.Enum.ConsumoEnergetico;



public class Lavadora extends Electrodomestico{
    
    private Integer carga;
    
    //constructores

    public Lavadora() {
    }

   

    public Lavadora(Integer carga, Integer precio, Color color, ConsumoEnergetico cEnergetico, Integer peso) {
        super(precio, color, cEnergetico, peso);
        this.carga = carga;
    }

    //getter y setter

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }
    
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (this.carga>30) {
            this.precio+=500;
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + super.toString()+'}';
    }
    


}
