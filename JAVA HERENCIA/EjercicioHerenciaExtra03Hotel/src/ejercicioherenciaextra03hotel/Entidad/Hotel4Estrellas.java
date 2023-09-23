package ejercicioherenciaextra03hotel.Entidad;

import ejercicioherenciaextra03hotel.Enum.Gimnasio;

public class Hotel4Estrellas extends Hotel {

    protected Gimnasio gimnasio;
    protected String nombreRestaurante;
    protected Integer capacidadRestaurante;

    //constructores
    public Hotel4Estrellas() {
    }

    public Hotel4Estrellas(Gimnasio gimnasio, String nombreRestaurante, Integer capacidadRestaurante, Integer habitaciones, Integer camas, Integer pisos, Integer precioHabitacion, String nombre, String direccion, String localidad, String nombreGerente) {
        super(habitaciones, camas, pisos, precioHabitacion, nombre, direccion, localidad, nombreGerente);
        this.gimnasio = gimnasio;
        this.nombreRestaurante = nombreRestaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    //getters y setters 
    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Gimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombreRestaurante() {
        return nombreRestaurante;
    }

    public void setNombreRestaurante(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
    }

    public Integer getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

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
        Integer vaHotel = 1*this.pisos;
        Integer vaRestaurante =0;
        if (this.capacidadRestaurante<30) {
            vaRestaurante=10;
        }
        if (this.capacidadRestaurante>=30 && this.capacidadRestaurante<=50) {
            vaRestaurante = 30;
        }
        if (this.capacidadRestaurante>50) {
            vaRestaurante = 50;
        }
        Integer vaGimnasio=0;
        switch  (gimnasio){
            case A:
                vaGimnasio=50;
                break;
            case B:
                vaGimnasio=30;
                break;
        }
        this.precioHabitacion=50+vaHotel+vaRestaurante+vaGimnasio;
        
    }
    
    @Override
    public String toString() {
        return "Hotel4Estrellas{" + "gimnasio=" + gimnasio + ", nombreRestaurante=" + nombreRestaurante + ", capacidadRestaurante=" + capacidadRestaurante + super.toString()+'}';
    }
    
    

}
