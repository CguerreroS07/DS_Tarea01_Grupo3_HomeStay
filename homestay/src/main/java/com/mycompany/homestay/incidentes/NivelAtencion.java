package com.mycompany.homestay.incidentes;

public abstract class NivelAtencion {
    protected NivelAtencion siguiente;
    
    public void setSiguiente(NivelAtencion siguiente) { 
        this.siguiente = siguiente; 
    }
    
    public abstract void atender(Incidente i);
}