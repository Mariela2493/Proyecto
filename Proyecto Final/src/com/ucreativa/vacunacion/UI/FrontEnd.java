package com.ucreativa.vacunacion.UI;
import com.ucreativa.vacunacion.repositories.FileRepository;
import com.ucreativa.vacunacion.services.CarteraClientesService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrontEnd extends JFrame {

    public FrontEnd(String titulo){
        super(titulo);
    }

    public void build(){
        this.construccionPantalla();
        this.crearComponentes();
        super.setVisible(true);
    }

    private void construccionPantalla(){
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400, 200);
        super.setLayout(new GridLayout(8, 2));
    }

    private void agregarComponente(Component componente){
        super.getContentPane().add(componente);
    }

    private void crearComponentes(){

        // Crear Labels
        JLabel lblNombre = new JLabel("Nombre");
        JLabel lblCedula = new JLabel("Cedula");
        JLabel lblTelefono= new JLabel("Telefono");
       JLabel lblEmail = new JLabel("Email");
        JLabel lblDireccion = new JLabel("Direccion");
        JLabel lblTipoPersona = new JLabel("Cliente o Proveedor");
        JLabel lblMetodoDeContacto = new JLabel("Por donde nos contacto el Cliente");
        JLabel lblFechaDeAsociacion = new JLabel("Fecha en que se esta ingresando la informacion");

        // Crear Textos
        JTextField txtNombre = new JTextField();
        JTextField txtCedula = new JTextField();
        JTextField txtTelefono = new JTextField();
        JTextField txtEmail = new JTextField();
        JTextField txtDireccion = new JTextField();
        JTextField txtTipoPersona = new JTextField();
        JTextField txtMetodoDeContacto = new JTextField();
        JTextField txtFechaDeAsociacion = new JTextField();
        JButton salvar = new JButton("Salvar");

        salvar.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensajeError =String.join("\n", " Faltan Campos Obligatorios por llenar");
                String mensajeExitoso = String.join("\n", "Info Almacenada con Exito");
                CarteraClientesService service = new CarteraClientesService(new FileRepository());
                if(txtNombre.getText().length()== 0 ||txtCedula.getText().length()== 0 ||
                        txtCedula.getText().length()== 0||txtTelefono.getText().length()== 0
                        ||txtEmail.getText().length()== 0 ||txtDireccion.getText().length()== 0
                        ||txtTipoPersona.getText().length()== 0) {

                    JOptionPane.showMessageDialog(((JButton) e.getSource()).getParent(),
                            mensajeError);
                } else{
                         service.save(

                            txtNombre.getText(),
                            txtCedula.getText(),
                            txtTelefono.getText(),
                            txtEmail.getText(),
                            txtDireccion.getText(),
                            txtTipoPersona.getText(),
                            txtMetodoDeContacto.getText(),
                            txtFechaDeAsociacion.getText());



                                txtNombre.setText("");
                                txtCedula.setText("");
                                txtTelefono.setText("");
                                txtEmail.setText("");
                                txtDireccion.setText("");
                                txtTipoPersona.setText("");
                                txtMetodoDeContacto.setText("");
                                txtFechaDeAsociacion.setText("");
                                JOptionPane.showMessageDialog(((JButton)e.getSource()).getParent(), mensajeExitoso );
                        }
            }
        });


        this.agregarComponente(lblNombre);
        this.agregarComponente(txtNombre);
        this.agregarComponente(lblCedula);
        this.agregarComponente(txtCedula);
        this.agregarComponente(lblTelefono);
        this.agregarComponente(txtTelefono);
        this.agregarComponente(lblEmail);
        this.agregarComponente(txtEmail);
        this.agregarComponente(lblDireccion);
        this.agregarComponente(txtDireccion);
        this.agregarComponente(lblTipoPersona);
        this.agregarComponente(txtTipoPersona);
        this.agregarComponente(lblMetodoDeContacto);
        this.agregarComponente(txtMetodoDeContacto);
        this.agregarComponente(salvar);


    }


}