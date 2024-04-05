
package bake.cakebank;

public class SDeposito {
    
    protected String numeroIdentidad;
    public double cantidad;
    protected String nombre;
    
    public SDeposito (String numeroIdentidad, double cantidad, String nombre) {
        this.numeroIdentidad = numeroIdentidad;
        this.cantidad = cantidad;
        this.nombre = nombre;
    }
    
    public String getNumeroIdentidad() {return numeroIdentidad;}
    
    public double getCantidad () {return cantidad;}
    
    public String getNombre() {return nombre;}
    
}