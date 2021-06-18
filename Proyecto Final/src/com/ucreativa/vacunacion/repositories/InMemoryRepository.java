package com.ucreativa.vacunacion.repositories;
import com.ucreativa.vacunacion.entities.CarteraContactos;
import com.ucreativa.vacunacion.entities.Cliente;
import com.ucreativa.vacunacion.entities.Asociado;
import com.ucreativa.vacunacion.entities.Proveedor;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InMemoryRepository implements Repository {

    private final List<CarteraContactos> db;

    public InMemoryRepository(){
        this.db = new ArrayList<>();
    }

    public void save(Asociado asociado, Date fechadeAsociado){
        this.db.add(new CarteraContactos(asociado, fechadeAsociado));
    }



    public List<String> get() {
        List<String> lines = new ArrayList<>();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        for (CarteraContactos item : db){
            lines.add(item.getPersona().getNombre()

                    + " - " + format.format(item.getFechadeAsociado()));
        }
        return lines;
    }


    @Override
    public void saveCliente(Cliente persona, Date fecha) {

    }

    @Override
    public void saveProveedor(Proveedor persona, Date fecha) {

    }

    @Override
    public List<String> getCliente() {
        return null;
    }

    @Override
    public List<String> getProveedor() {
        return null;
    }
}