package ejercicioherenciaextra03hotel.Entidad;

import ejercicioherenciaextra03hotel.Enum.Gimnasio;

public final class Hotel5Estrellas extends Hotel4Estrellas {

    private Integer cantidadSalonesConf;
    private Integer cantidadSuites;
    private Integer cantidadLimosinas;

    //constructores
    public Hotel5Estrellas() {
    }

    public Hotel5Estrellas(Integer cantidadSalonesConf, Integer cantidadSuites, Integer cantidadLimosinas, Gimnasio gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer habitaciones, Integer camas, Integer pisos, Integer precioHabitacion, String nombre, String direccion, String localidad, String nombreGerente) {
        super(gimnasio, nombreRestaurante, capacidadRestaurante, habitaciones, camas, pisos, precioHabitacion, nombre, direccion, localidad, nombreGerente);
        this.cantidadSalonesConf = cantidadSalonesConf;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }

    //getters y setters 
    public Integer getCantidadSalonesConf() {
        return cantidadSalonesConf;
    }

    public void setCantidadSalonesConf(Integer cantidadSalonesConf) {
        this.cantidadSalonesConf = cantidadSalonesConf;
    }

    public Integer getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(Integer cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public Integer getCantidadLimosinas() {
        return cantidadLimosinas;
    }

    public void setCantidadLimosinas(Integer cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    @Override
    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    @Override
    public void setGimnasio(Gimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }

    @Override
    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    @Override
    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    @Override
    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    @Override
    public void setCapacidadRestaurante(Integer capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public Integer getHabitaciones() {
        return habitaciones;
    }

    @Override
    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    @Override
    public Integer getCamas() {
        return camas;
    }

    @Override
    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    @Override
    public Integer getPisos() {
        return pisos;
    }

    @Override
    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    @Override
    public Integer getPrecioHabitacion() {
        return precioHabitacion;
    }

    @Override
    public void setPrecioHabitacion(Integer precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
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
    public void calcularPrecio(){
        super.calcularPrecio();
        Integer vaLimosinas= 15*this.cantidadLimosinas;
        this.precioHabitacion+=vaLimosinas;
    }
    
    @Override
    public String toString() {
        return "Hotel5Estrellas{" + "cantidadSalonesConf=" + cantidadSalonesConf + ", cantidadSuites=" + cantidadSuites + ", cantidadLimosinas=" + cantidadLimosinas + super.toString()+'}';
    }

    
}
