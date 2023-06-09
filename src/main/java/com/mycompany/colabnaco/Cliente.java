/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colabnaco;

/**
 *
 * @author leona
 */
public class Cliente {
     private String nombre;
    private String Correo;
    private String solicitud;

    public Cliente(String nombre, String Correo, String solicitud) {
        this.nombre = nombre;
        this.Correo = Correo;
        this.solicitud = solicitud;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(String solicitud) {
        this.solicitud = solicitud;
    }
    
}
