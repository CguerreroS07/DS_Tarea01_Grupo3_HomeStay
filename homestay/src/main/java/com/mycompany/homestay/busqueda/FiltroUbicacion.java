package com.mycompany.homestay.busqueda;

import com.mycompany.homestay.propiedades.Unidad;

public class FiltroUbicacion implements FiltroBusqueda {
    @Override
    public boolean cumple(Unidad u, CriteriosBusqueda c) {
        return true; 
    }
}