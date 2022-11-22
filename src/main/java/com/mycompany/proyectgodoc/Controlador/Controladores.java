
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
        
        if (e.getSource()== form.jBGenerar){
            guardar ();
        
        }
        
        
      }
    public void guardar(){
    
        contratista.setNombre(form.textNombre.getText());
        contratista.setApellido(form.textApellido.getText());
        contratista.setCedula(form.textDocumento1.getText());
        contratista.setDireccion(form.textDireccion.getText());
        contratista.setLugarExpedicion(form.textLugarEX.getText());
        contratista.setFechaInicio(form..getText());
        contratista.setValorContrato(form.textValorC.getText());
        contratista.setValorContrato(form.text.getText());
        
    }
    
    
    
}
