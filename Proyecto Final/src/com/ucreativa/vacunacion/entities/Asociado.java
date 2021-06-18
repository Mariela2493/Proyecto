package com.ucreativa.vacunacion.entities;

public class Asociado {

    private String nombre;
    private String cedula;
    private String numeroTelefono;
    private String email;
    private String direccion;
    private String tipoPersona;

    public Asociado(String nombre, String cedula, String numeroTelefono, String email, String direccion, String tipoPersona) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.numeroTelefono = numeroTelefono;
        this.email = email;
        this.direccion = direccion;
        this.tipoPersona= tipoPersona;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDireccion() {
        return direccion;

    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }
    public void setTipoPersona(String direccion) {
        this.direccion = direccion;
    }
}