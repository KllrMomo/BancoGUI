
package bake.cakebank;

import java.util.List;

public interface IOpBanco {
    
    int verificarCuenta(SDeposito solicitud);
    void atenderSolicitud(List<SDeposito> solicitudes);
    List<CAhorro> DarBajaAMillonarios();
    
}