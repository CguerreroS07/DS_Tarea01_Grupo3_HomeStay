package com.mycompany.homestay.incidentes;

import com.mycompany.homestay.propiedades.Huesped;
import com.mycompany.homestay.reservas.Reserva;

public class ServicioIncidentes {
    public Incidente reportar(Huesped h, Reserva r, String desc) {
        System.out.println("Incidente reportado.");
        return new Incidente("INC-01");
    }
    
    public void gestionar(Incidente i, NivelAtencion cadena) {
        cadena.atender(i);
    }
}