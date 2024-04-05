
package bake.cakebank;

import java.util.ArrayList;
import java.util.List;

public class Banco implements IOpBanco{
    
    protected List<CAhorro> cuentas;
    protected List<SDeposito> solicitudes;
    
    public Banco() {
        cuentas = new ArrayList<>();
        solicitudes = new ArrayList<>();
    }
    
    public void aSolicitud (SDeposito solicitud) {
        solicitudes.add(solicitud);
    }

    @Override
    public int verificarCuenta(SDeposito solicitud) {
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getNumIdentidad() == solicitud.getNumeroIdentidad()) {
                return i; //La cuenta si existe
            }
        }
        //Crear cuenta nueva
        CAhorro nuevaCuenta = new CAhorro(solicitud.getNumeroIdentidad(), 0, cuentas.size());
        cuentas.add(nuevaCuenta);
        return cuentas.size() - 1; // Regresa posicion de la nueva cuenta
    }

    @Override
    public void atenderSolicitud(List<SDeposito> solicitudes) {
        for (SDeposito solicitud : solicitudes) {
            int pCuenta = verificarCuenta(solicitud);
            cuentas.get(pCuenta).depositar(solicitud.getCantidad());
        }
    }
    
    @Override
    public List<CAhorro> DarBajaAMillonarios() {
        List<CAhorro> cuentaMillonaria = new ArrayList<>();
        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getsActual() > 1000000) {
                cuentaMillonaria.add(cuentas.remove(i));
            }
        }
        return cuentaMillonaria;
    }
    
}

/*public void AtenderSolicitud(){
        if (!solicitudes.isEmpty()) {
            SDeposito solicitud = solicitudes.get(0);
            int pos = verificarCuenta(solicitud);
            cuentas.get(pos).depositar(solicitud.getCantidad());
            solicitudes.remove(0);
        } else {
            System.out.println("No hay solicitudes pendientes.");
        }
    }*/
    
    /*public void atenderTodasLasSolicitudes() {
        while (!solicitudes.isEmpty()) {
            AtenderSolicitud();
        }
        System.out.println("Todas las solicitudes han sido realizadas.");
    }*/