package com.mycompany.homestay.incidentes;

public class NivelAnfitrion extends NivelAtencion {
    @Override
    public void atender(Incidente i) {
        System.out.println("Anfitrión atendiendo incidente. Proponiendo solución...");
    }
}