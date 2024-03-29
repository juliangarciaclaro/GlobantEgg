
package ejercicioherenciaextra02edificio.Entidad;


public abstract class Edificio {
    
    protected Double ancho;
    protected Double alto;
    protected Double largo;
    
    //constructores

    public Edificio() {
    }

    public Edificio(Double ancho, Double alto, Double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }
    //getters y setters

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAlto() {
        return alto;
    }

    public void setAlto(Double alto) {
        this.alto = alto;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }
    
    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();
}
