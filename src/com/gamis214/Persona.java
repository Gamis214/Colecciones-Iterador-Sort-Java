package com.gamis214;

/**
 * Created by Gamis on 12/30/2015.
 */
public class Persona {
    String nombre,apellido;
    long telefono;

    public Persona(String nombre,String apellido,long telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public long getTelefono() {
        return telefono;
    }
}
