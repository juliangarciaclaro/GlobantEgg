package ejercicioherenciaextra03hotel.Entidad;

public final class Residencia extends Extrahotelero {

    private Integer cantidadHab;
    private boolean tieneDescuentos;
    private boolean tieneCamDep;

    //constructores
    public Residencia() {
    }

    public Residencia(Integer cantidadHab, boolean tieneDescuentos, boolean tieneCamDep, boolean esPrivado, Integer metros2, String nombre, String direccion, String localidad, String nombreGerente) {
        super(esPrivado, metros2, nombre, direccion, localidad, nombreGerente);
        this.cantidadHab = cantidadHab;
        this.tieneDescuentos = tieneDescuentos;
        this.tieneCamDep = tieneCamDep;
    }

    //getter y setter
    public Integer getCantidadHab() {
        return cantidadHab;
    }

    public void setCantidadHab(Integer cantidadHab) {
        this.cantidadHab = cantidadHab;
    }

    public boolean isTieneDescuentos() {
        return tieneDescuentos;
    }

    public void setTieneDescuentos(boolean tieneDescuentos) {
        this.tieneDescuentos = tieneDescuentos;
    }

    public boolean isTieneCamDep() {
        return tieneCamDep;
    }

    public void setTieneCamDep(boolean tieneCamDep) {
        this.tieneCamDep = tieneCamDep;
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
        return "Residencia{" + "cantidadHab=" + cantidadHab + ", tieneDescuentos=" + tieneDescuentos + ", tieneCamDep=" + tieneCamDep + super.toString()+'}';
    }
    
    

}
