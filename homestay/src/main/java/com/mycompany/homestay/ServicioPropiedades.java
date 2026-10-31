/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homestay;


/**
 *
 * @author The Beast
 */
public class ServicioPropiedades {
    public Propiedad registrarPropiedad(Anfitrion a, Propiedad p) {
        System.out.println("Registrando propiedad en: " + p);
        return p;
    }
    public void cambiarEstadoUnidad(Unidad u, String nuevoEstado) {
        u.cambiarEstado(nuevoEstado);
        System.out.println("Estado de unidad actualizado a: " + nuevoEstado);
    }
}