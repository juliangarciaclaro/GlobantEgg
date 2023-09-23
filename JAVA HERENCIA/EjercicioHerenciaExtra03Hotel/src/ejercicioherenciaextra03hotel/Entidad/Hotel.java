package ejercicioherenciaextra03hotel.Entidad;

public class Hotel extends Alojamiento {

    protected Integer habitaciones;
    protected Integer camas;
    protected Integer pisos;
    protected Integer precioHabitacion;

    //constructores
    public Hotel() {
    }

    public Hotel(Integer habitaciones, Integer camas, Integer pisos, Integer precioHabitacion, String nombre, String direccion, String localidad, String nombreGerente) {
        super(nombre, direccion, localidad, nombreGerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precioHabitacion = precioHabitacion;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Integer getCamas() {
        return camas;
    }

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public Integer getPrecioHabitacion() {
        return precioHabitacion;
    }

    //getters y setters
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

    public void calcularPrecio() {

    }

    @Override
    public String toString() {
        return "Hotel{" + "habitaciones=" + habitaciones + ", camas=" + camas + ", pisos=" + pisos + ", precioHabitacion=" + precioHabitacion + super.toString() + '}';
    }

   

}
