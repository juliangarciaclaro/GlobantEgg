/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioherenciaextra02edificio.Entidad;

/**
 *
 * @author USUARIO
 */
public class Polideportivo extends Edificio  {
    
    private String nombre;
    private String tipoInstalacion;

    //constructores

    public Polideportivo() {
    }


    public Polideportivo(String nombre, String tipoInstalacion, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }
    
    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    @Override
    public Double getAncho() {
        return ancho;
    }

    @Override
    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    @Override
    public Double getAlto() {
        return alto;
    }

    @Override
    public void setAlto(Double alto) {
        this.alto = alto;
    }

    @Override
    public Double getLargo() {
        return largo;
    }

    @Override
    public void setLargo(Double largo) {
        this.largo = largo;
    }
    
    //metodos
    

    
    @Override
    public void calcularSuperficie() {
        Double superficie = ancho*largo;
        System.out.println("la superficie de este polideportivo es: "+superficie);
    }

    @Override
    public void calcularVolumen() {
        Double volumen = ancho*largo*alto;
        System.out.println("el volumen de este polideportivo es: "+volumen);
    }
    
    
}
