package com.mycompany.homestay.busqueda;

import com.mycompany.homestay.propiedades.Unidad;

public interface FiltroBusqueda {
    boolean cumple(Unidad u, CriteriosBusqueda c);
}

