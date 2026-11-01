package com.mycompany.homestay.incidentes;

public class CanalEmail implements CanalNotificacion {
    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Enviando EMAIL a " + destinatario + ": " + mensaje);
    }
}
