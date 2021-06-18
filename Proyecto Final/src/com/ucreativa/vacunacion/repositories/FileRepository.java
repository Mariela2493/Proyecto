package com.ucreativa.vacunacion.repositories;
import com.ucreativa.vacunacion.entities.Cliente;
import com.ucreativa.vacunacion.entities.Proveedor;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class FileRepository implements Repository{

    private final String FILE_PATHC = "CarteraaClientes.txt";
    private final String FILE_PATHP = "CarteraaProveedores.txt";


    public void saveCliente(Cliente persona, Date fechaAsociado) {

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

       // if (persona.getTipoPersona().contains("Cliente")) {
            String text = "Tipo: " + persona.getTipoPersona() + " Nombre: " + persona.getNombre() +
                    " Cedula: " + persona.getCedula() +" Telefono: " + persona.getNumeroTelefono()+
                    " Email: " + persona.getEmail()+ " Direccion: " + persona.getDireccion() + " Metodo de Contacto: "
                    +  persona.getmetodoContacto()+ " Fecha en que se ingreso la Info " + format.format(fechaAsociado) + "\n";

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATHC, true));
                writer.append(text);
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    public void saveProveedor(Proveedor persona, Date fechaAsociado) {

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");

        // if (persona.getTipoPersona().contains("Cliente")) {
        String text = "Tipo: " + persona.getTipoPersona() + " Nombre: " + persona.getNombre() +
                " Cedula: " + persona.getCedula() +" Telefono: " + persona.getNumeroTelefono()+
                " Email: " + persona.getEmail()+ " Direccion: " + persona.getDireccion() + " Metodo de Contacto: "
                + " Fecha en que se ingreso la Info " + format.format(fechaAsociado) + "\n";

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATHP, true));
            writer.append(text);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public List<String> getCliente() {
       try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATHC));
           return reader.lines().collect(Collectors.toList());
       } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
       return null;
    }

    public List<String> getProveedor() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(FILE_PATHP));
            return reader.lines().collect(Collectors.toList());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}