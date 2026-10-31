package com.mycompany.homestay.busqueda;

import com.mycompany.homestay.propiedades.Unidad;
import java.util.List;
import java.util.ArrayList;

public class ServicioBusqueda {
    private ServicioDisponibilidad servicioDisponibilidad = new ServicioDisponibilidad();

    public List<Unidad> buscar(CriteriosBusqueda c) {
        if (!c.validar()) return new ArrayList<>();
        System.out.println("Buscando unidades disponibles");
        return new ArrayList<>(); 
    }
}