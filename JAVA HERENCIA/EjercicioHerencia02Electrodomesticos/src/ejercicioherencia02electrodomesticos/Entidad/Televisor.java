/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherencia02electrodomesticos.Entidad;

import ejercicioherencia02electrodomesticos.Enum.Color;
import ejercicioherencia02electrodomesticos.Enum.ConsumoEnergetico;

public class Televisor extends Electrodomestico {

    private Double resolucion;
    private boolean TDT;

    //constructores
    public Televisor() {

    }

    public Televisor(Double resolucion, boolean TDT, Integer precio, Color color, ConsumoEnergetico cEnergetico, Integer peso) {
        super(precio, color, cEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    //getter y setter
    public Double getResolucion() {
        return resolucion;
    }

    public void setResolucion(Double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    // metodos 
    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            int porcentaje = (int) ((int) this.precio * 0.3);
            this.precio += porcentaje;
        }

        if (this.TDT) {
            this.precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Televisor{" + "resolucion=" + resolucion + ", TDT=" + TDT +super.toString()+ '}';
    }

    
}
