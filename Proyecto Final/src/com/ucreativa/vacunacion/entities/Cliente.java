package com.ucreativa.vacunacion.entities;

public class Cliente extends Asociado {
    private String metodoContacto;


    public Cliente(String nombre, String cedula, String  numeroTelefono, String email,String direccion,
                   String tipoPersona, String metodoContacto) {
        super(nombre, cedula,numeroTelefono, email,direccion,tipoPersona);
        this.metodoContacto = metodoContacto;

    }




    public String getmetodoContacto() {
        return metodoContacto;
    }
    public void setmetodoContacto(String metodoContacto) {
        this.metodoContacto= metodoContacto;
    }









}
