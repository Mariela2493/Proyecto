package com.ucreativa.vacunacion.entities;

public class Proveedor extends Asociado {


    public Proveedor(String nombre, String cedula, String numeroTelefono, String email,String direccion, String tipoPersona, String tipoServicios) {
        super(nombre, cedula,numeroTelefono, email,direccion,tipoPersona);
        this.tipoServicios = tipoServicios;
    }

    private String tipoServicios;


    public String gettipoServicios() {

        return tipoServicios;
    }

    public void settipoServicios(String parentezco) {

        this.tipoServicios= tipoServicios;
    }
}


