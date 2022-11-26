
package com.mycompany.proyectgodoc;

import com.mycompany.proyectgodoc.Controlador.ControladorVistaLogin;
import com.mycompany.proyectgodoc.Controlador.Controladores;
import com.mycompany.proyectgodoc.VistaApp.Formulario;
import com.mycompany.proyectgodoc.VistaApp.Login;
import com.mycompany.proyectosemestre.LeerDocumento;
import java.io.FileNotFoundException;


public class Main{
    
    public static void main(String[] args) throws FileNotFoundException {
     
        LeerDocumento leerpdf = new LeerDocumento();
        leerpdf.Leer();
        //Login login = new Login();
        //login.setVisible(true);
        
        
       
    }
}
