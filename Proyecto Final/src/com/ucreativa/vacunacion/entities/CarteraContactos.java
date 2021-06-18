package com.ucreativa.vacunacion.entities;

import java.util.Date;

public class CarteraContactos {

    private Asociado asociado;
    private Date fechadeAsociado;


    public CarteraContactos(Asociado asociado, Date fechadeAsociado) {
        this.asociado = asociado;
        this.fechadeAsociado = fechadeAsociado;

    }
    public Asociado getPersona() {

        return asociado;
    }

    public Date getFechadeAsociado() {
        return fechadeAsociado;
    }



}
