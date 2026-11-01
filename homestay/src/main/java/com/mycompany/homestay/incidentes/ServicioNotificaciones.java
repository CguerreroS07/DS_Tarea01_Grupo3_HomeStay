package com.mycompany.homestay.incidentes;

public class ServicioNotificaciones {
    private CanalNotificacion canal;
    
    public ServicioNotificaciones(CanalNotificacion canal) { 
        this.canal = canal; 
    }
    
    public void notificar(String destinatario, String tipo, String msg) {
        canal.enviar(destinatario, "[" + tipo + "] " + msg);
    }
}
