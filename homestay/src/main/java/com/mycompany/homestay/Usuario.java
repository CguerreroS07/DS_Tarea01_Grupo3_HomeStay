/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homestay;

/**
 *
 * @author The Beast
 */
public abstract class Usuario {
    protected String id;
    protected String nombre;
    
    public Usuario(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
}

class Huesped extends Usuario {
    public Huesped(String id, String nombre) { super(id, nombre); }
}

class Anfitrion extends Usuario {
    public Anfitrion(String id, String nombre) { super(id, nombre); }
}
