/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homestay.propiedades;

/**
 *
 * @author The Beast
 */


public class Unidad {
    private String id;
    private String tipo;
    private double precio;
    private String estado;

    public Unidad(String id, String tipo, double precio) {
        this.id = id;
        this.tipo = tipo;
        this.precio = precio;
        this.estado = "DISPONIBLE";
    }
    
    public void cambiarEstado(String nuevoEstado) { 
        this.estado = nuevoEstado; 
    }
    
    public String getId() { 
        return id; 
    }
 }