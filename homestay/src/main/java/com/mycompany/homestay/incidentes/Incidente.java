package com.mycompany.homestay.incidentes;

public class Incidente {
    private String id;
    private String estado;
    
    public Incidente(String id) { 
        this.estado = "REPORTADO"; 
    }
    
    public void resolver() { 
        this.estado = "RESUELTO"; 
    }
    
    public void escalar() { 
        this.estado = "ESCALADO"; 
    }
}

