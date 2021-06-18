package com.ucreativa.vacunacion.repositories;
import com.ucreativa.vacunacion.entities.Cliente;
import com.ucreativa.vacunacion.entities.Proveedor;

import java.util.Date;
import java.util.List;

public interface Repository {

    void saveCliente(Cliente persona, Date fecha);
    void saveProveedor(Proveedor persona, Date fecha);

    List<String> getCliente();
    List<String> getProveedor();

}

