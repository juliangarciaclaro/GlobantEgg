package ejercicioherenciaextra03hotel.Entidad;

public final class Camping extends Extrahotelero {

    private Integer capMaxCarpas;
    private Integer cantidadBaños;
    private boolean tieneRestaurante;

    //constructores
    public Camping() {
    }

    public Camping(Integer capMaxCarpas, Integer cantidadBaños, boolean tieneRestaurante, boolean esPrivado, Integer metros2, String nombre, String direccion, String localidad, String nombreGerente) {
        super(esPrivado, metros2, nombre, direccion, localidad, nombreGerente);
        this.capMaxCarpas = capMaxCarpas;
        this.cantidadBaños = cantidadBaños;
        this.tieneRestaurante = tieneRestaurante;
    }

    //getter y setter
    public Integer getCapMaxCarpas() {
        return capMaxCarpas;
    }

    public void setCapMaxCarpas(Integer capMaxCarpas) {
        this.capMaxCarpas = capMaxCarpas;
    }

    public Integer getCantidadBaños() {
        return cantidadBaños;
    }

    public void setCantidadBaños(Integer cantidadBaños) {
        this.cantidadBaños = cantidadBaños;
    }

    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }

    @Override
    public boolean isEsPrivado() {
        return esPrivado;
    }

    @Override
    public void setEsPrivado(boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    @Override
    public Integer getMetros2() {
        return metros2;
    }

    @Override
    public void setMetros2(Integer metros2) {
        this.metros2 = metros2;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String getLocalidad() {
        return localidad;
    }

    @Override
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    @Override
    public String getNombreGerente() {
        return nombreGerente;
    }

    @Override
    public void setNombreGerente(String nombreGerente) {
        this.nombreGerente = nombreGerente;
    }

    @Override
    public String toString() {
        return "Camping{" + "capMaxCarpas=" + capMaxCarpas + ", cantidadBa\u00f1os=" + cantidadBaños + ", tieneRestaurante=" + tieneRestaurante +super.toString()+ '}';
    }
    
    

}
