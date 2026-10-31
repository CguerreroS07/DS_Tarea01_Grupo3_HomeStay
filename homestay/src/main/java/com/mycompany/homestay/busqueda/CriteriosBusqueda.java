package com.mycompany.homestay.busqueda;

public class CriteriosBusqueda {
    private String ubicacion;
    private Periodo periodo;
    
    public CriteriosBusqueda(String ubicacion, Periodo periodo) {
        this.ubicacion = ubicacion;
        this.periodo = periodo;
    }
    
    public boolean validar() { 
        return true; 
    }
}
