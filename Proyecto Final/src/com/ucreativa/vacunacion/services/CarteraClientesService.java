package com.ucreativa.vacunacion.services;
import com.ucreativa.vacunacion.entities.Cliente;
import com.ucreativa.vacunacion.entities.Proveedor;
import com.ucreativa.vacunacion.repositories.Repository;
import java.util.Date;
import java.util.List;


public class CarteraClientesService {

    private Repository repository;

    public CarteraClientesService(Repository repository){
        this.repository = repository;
    }
    public void save(String nombre, String cedula, String numeroTelefono, String email,String direccion,
                     String tipoPersona, String metodoContacto,String tipoServicios){



        if (tipoPersona.contains("Cliente")){
          Cliente  persona = new Cliente(nombre, cedula,numeroTelefono,email,direccion, tipoPersona,metodoContacto);
            this.repository.saveCliente(persona, new Date());
        }else {
          Proveedor  persona = new Proveedor(nombre, cedula,numeroTelefono,email,direccion, tipoPersona,tipoServicios);
            this.repository.saveProveedor(persona, new Date());
        }

    }

    public List<String> getCliente(){
        return this.repository.getCliente();
    }

    public List<String> getProveedor(){
        return this.repository.getProveedor();
    }

}