package com.mycompany.proyectgodoc.Controlador;

import com.mycompany.proyectgodoc.Dao.LoginDao;
import com.mycompany.proyectgodoc.Modelo.Asesor;
import com.mycompany.proyectgodoc.VistaApp.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;


public class ControladorVistaLogin implements ActionListener{
    
    private Login VLogin;
    private Asesor as;
    private LoginDao loginDao;
    private ControladorVistaLogin ctrlVistaLogin;
    
    public ControladorVistaLogin ()
    {
        
        this.VLogin = new Login();
        this.as = new Asesor();
        this.ctrlVistaLogin = new ControladorVistaLogin();
        this.loginDao = new LoginDao();
        this.VLogin.jButtonEntrar.addActionListener(this);

    }
    
    public void iniciar()
    {
        VLogin.setTitle("INICIO DE SESION");
        VLogin.setLocationRelativeTo(null);
        //VLogin.txtConIn.setVisible(false);
        mostrar();
    
    }
    
    public void mostrar()
    {
        VLogin.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
