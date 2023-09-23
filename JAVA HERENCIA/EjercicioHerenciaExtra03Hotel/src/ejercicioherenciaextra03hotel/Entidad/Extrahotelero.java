package ejercicioherenciaextra03hotel.Entidad;

public class Extrahotelero extends Alojamiento {

    protected boolean esPrivado;
    protected Integer metros2;

    //constructores
    public Extrahotelero() {
    }

    public Extrahotelero(boolean esPrivado, Integer metros2, String nombre, String direccion, String localidad, String nombreGerente) {
        super(nombre, direccion, localidad, nombreGerente);
        this.esPrivado = esPrivado;
        this.metros2 = metros2;
    }

    //getters y setters
    public boolean isEsPrivado() {
        return esPrivado;
    }

    public void setEsPrivado(boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    public Integer getMetros2() {
        return metros2;
    }

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
    
    //metodos

    @Override
    public String toString() {
        return "Extrahotelero{" + "esPrivado=" + esPrivado + ", metros2=" + metros2 + super.toString()+'}';
    }
    

}
