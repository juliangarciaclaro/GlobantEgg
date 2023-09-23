package ejercicioherencia02electrodomesticos.Entidad;

import ejercicioherencia02electrodomesticos.Enum.Color;
import ejercicioherencia02electrodomesticos.Enum.ConsumoEnergetico;

public class Electrodomestico {

    protected Integer precio;
    protected Color color;
    protected ConsumoEnergetico cEnergetico;
    protected Integer peso;

    //constructores 
    public Electrodomestico() {

    }

    public Electrodomestico(Integer precio, Color color, ConsumoEnergetico cEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.cEnergetico = cEnergetico;
        this.peso = peso;
    }

  //getters y setters

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ConsumoEnergetico getcEnergetico() {
        return cEnergetico;
    }

    public void setcEnergetico(ConsumoEnergetico cEnergetico) {
        this.cEnergetico = cEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    
    


    //metodos 

    public void precioFinal() {

        Integer costoConsumo = 0;
        
        switch  (this.cEnergetico){
            case A:
                costoConsumo =1000;
            case B:
                costoConsumo =800;
            case C:
                costoConsumo =600;
            case D: 
                costoConsumo =500;
            case E:
                costoConsumo =300;
            case F:
                costoConsumo = 100;
        }
        
        Integer costoPeso = 0;
        if (this.peso >= 1 && this.peso <= 19) {
            costoPeso += 100;
        } else if (this.peso >= 20 && this.peso <= 49) {
            costoPeso += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            costoPeso += 800;
        } else if (this.peso >= 80) {
            costoPeso += 1000;
        }
        this.precio =1000+(costoConsumo+costoPeso);
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", cEnergetico=" + cEnergetico + ", peso=" + peso + '}';
    }

}
