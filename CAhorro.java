
package bake.cakebank;

public class CAhorro {
    
    protected String numeroIdentidad;
    public double sActual;
    protected int numCuenta;
    
    public CAhorro (String numeroIdentidad, double sActual, int numCuenta){
        this.numeroIdentidad = numeroIdentidad;
        this.sActual = sActual;
        this.numCuenta = numCuenta;
    }
    
    public double getsActual () {return sActual;}
    
    public void depositar(double cantidad) {sActual += cantidad; }

    public String getNumIdentidad() {return numeroIdentidad;}
    
    public int getNumCuenta () {return numCuenta;}
    
}