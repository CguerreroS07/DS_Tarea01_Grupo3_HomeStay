package com.mycompany.homestay.incidentes;

public class NivelModerador extends NivelAtencion {
    @Override
    public void atender(Incidente i) {
        System.out.println("Moderador evaluando el incidente. Buscando resolución imparcial...");
        if (siguiente != null) {
            siguiente.atender(i);
        }
    }
}
