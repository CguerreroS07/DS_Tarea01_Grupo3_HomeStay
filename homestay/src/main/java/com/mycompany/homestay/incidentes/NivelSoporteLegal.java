package com.mycompany.homestay.incidentes;

public class NivelSoporteLegal extends NivelAtencion {
    @Override
    public void atender(Incidente i) {
        System.out.println("Soporte Legal interviniendo. Aplicando políticas estrictas de la plataforma.");
    }
}
