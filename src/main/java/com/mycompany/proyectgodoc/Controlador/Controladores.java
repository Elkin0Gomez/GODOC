
package com.mycompany.proyectgodoc.Controlador;

import com.mycompany.proyectgodoc.Dao.FormularioDao;
import com.mycompany.proyectgodoc.Modelo.Contratista;
import com.mycompany.proyectgodoc.VistaApp.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Controladores implements ActionListener{
    
    private Contratista contratista;
    private Formulario form;
    private FormularioDao formDao;

    public Controladores() {
        this.contratista = new Contratista();
        this.form = new Formulario();
        this.formDao = new FormularioDao();
        this.form.jBVolver.addActionListener(this);
        this.form.jBGenerar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
