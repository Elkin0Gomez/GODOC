
package com.mycompany.proyectgodoc.Controlador;

import com.mycompany.proyectgodoc.Dao.FormularioDao;
import com.mycompany.proyectgodoc.Modelo.Contratista;
import com.mycompany.proyectgodoc.VistaApp.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Controladores implements ActionListener{
    
    private Contratista contratista;
    private Formulario form;
    private FormularioDao formDao;

    public Controladores() {
        this.contratista = new Contratista();
        this.form = new Formulario();
        this.formDao = new FormularioDao();
        // se llaman los botones
        this.form.jBVolver.addActionListener(this);
        this.form.jBGenerar.addActionListener(this);
    }

    
    public void iniciar ()
    {
    
        form.setTitle("Registrar Datos");
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e) 
        {
        
        /*if (e.getSource()== form.jBGenerar){
                 // codigo para convertir el calendario en String
                String fechaInicio = ((JTextField)form.jDateFechaIn.getDateEditor().getUiComponent()).getText();
                String fechaFin = ((JTextField)form.jDateFechaFin.getDateEditor().getUiComponent()).getText();
                String fechaCon = ((JTextField)form.jDateFechaCon.getDateEditor().getUiComponent()).getText();
                // seteamos los variables
                contratista.setNombre(form.textNombre.getText());
                contratista.setApellido(form.textApellido.getText());
                contratista.setCedula(form.textDocumento1.getText());
                contratista.setDireccion(form.textDireccion.getText());
                contratista.setLugarExpedicion(form.textLugarEX.getText());
                contratista.setValorContrato(form.textValorC.getText());
                contratista.setFechaInicio(fechaInicio);
                contratista.setFechaFin(fechaFin);
                contratista.setFechaContrato(fechaCon);
                
        
                 if (formDao.guardar(contratista)){
        
                   JOptionPane.showMessageDialog(null, "Los datos se han guardado exitosamente"  );    
              }   
                else   {
                   JOptionPane.showMessageDialog(null, "no se guardaron los datos"  );  
             } 
     }*/
            
            
        
        }
    
      }
    /*public void guardar(){
        // codigo para convertir el calendario en String
        String fechaInicio = ((JTextField)form.jDateFechaIn.getDateEditor().getUiComponent()).getText();
        String fechaFin = ((JTextField)form.jDateFechaFin.getDateEditor().getUiComponent()).getText();
        // seteamos los variables
        contratista.setNombre(form.textNombre.getText());
        contratista.setApellido(form.textApellido.getText());
        contratista.setCedula(form.textDocumento1.getText());
        contratista.setDireccion(form.textDireccion.getText());
        contratista.setLugarExpedicion(form.textLugarEX.getText());
        contratista.setFechaInicio(fechaInicio);
        contratista.setFechaFin(fechaFin);
        contratista.setValorContrato(form.textValorC.getText());
        
        if (formDao.guardar(contratista)){
        
            JOptionPane.showMessageDialog(null, "Los datos se han guardado exitosamente"  );    
        }   
        else   {
            JOptionPane.showMessageDialog(null, "no se guardo"  );  
        } 
    }*/

   /* public void iniciar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    
    
    

