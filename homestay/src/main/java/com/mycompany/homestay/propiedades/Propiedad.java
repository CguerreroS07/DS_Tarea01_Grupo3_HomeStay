/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homestay.propiedades;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author The Beast
 */
public class Propiedad {
    private String id;
    private String ubicacion;
    private Anfitrion anfitrion;
    private List<Unidad> unidades = new ArrayList<>();

    public Propiedad(String id, String ubicacion, Anfitrion anfitrion) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.anfitrion = anfitrion;
    }
    
    public void agregarUnidad(Unidad u) { 
        unidades.add(u); 
    }
    
    public List<Unidad> getUnidades() { 
        return unidades; 
    }
}
