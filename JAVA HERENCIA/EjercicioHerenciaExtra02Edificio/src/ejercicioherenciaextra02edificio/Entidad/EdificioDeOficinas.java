
package ejercicioherenciaextra02edificio.Entidad;


public class EdificioDeOficinas extends Edificio {
    
    private Integer oficinas;
    private Integer personas;
    private Integer pisos;

    //constructores

    public EdificioDeOficinas() {
    }


    public EdificioDeOficinas(Integer oficinas, Integer personas, Integer pisos, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.oficinas = oficinas;
        this.personas = personas;
        this.pisos = pisos;
    }
    
    //getter y setters 

    public Integer getOficinas() {
        return oficinas;
    }

    public void setOficinas(Integer oficinas) {
        this.oficinas = oficinas;
    }

    public Integer getPersonas() {
        return personas;
    }

    public void setPersonas(Integer personas) {
        this.personas = personas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
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
    public void cantPersonas(){
        Integer personasPiso = personas*oficinas;
        Integer personasEdificio = personasPiso*pisos;
        System.out.println("para este edificio entrarian "+personasPiso+" por piso y "+personasEdificio+" personas en todo el edificio");
    }
    
    @Override
    public void calcularSuperficie() {
        Double superficie = ancho*largo*pisos;
        System.out.println("la superficie del edificio es: "+superficie);
    }

    @Override
    public void calcularVolumen() {
        Double volumen = ancho*largo*alto*pisos;
        System.out.println("el volumen del edificio es: "+volumen);
    }
    
    
}
