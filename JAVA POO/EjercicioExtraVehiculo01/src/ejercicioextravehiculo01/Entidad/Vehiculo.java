
package ejercicioextravehiculo01.Entidad;


public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int año;
    private String tipo;
    
    //constructores

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int año, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.tipo = tipo;
    }
    
    //getters y setters 

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //metodos
    
    public int moverse(int segundos) {
        int metros =0;
        if (segundos<=0) {
            System.out.println("el vehiculo no se movió ni un solo metro");
            
        } else {
            switch (tipo) {
                
                case "auto":
                        metros = segundos*3;
                    break;
                case "moto":
                        metros = segundos*2;
                    break;
                case "bici":
                        metros = segundos;
                    break;
            }
        }
        
        return metros;
    }
    
    
    public int frenar() {
        int metros=0;
        switch (tipo) {
                
                case "auto":
                        metros = 2;
                    break;
                case "moto":
                        metros = 2;
                    break;
                case "bici":
                        metros = 0;
                    break;
            }
        return metros;
    }
    
}
