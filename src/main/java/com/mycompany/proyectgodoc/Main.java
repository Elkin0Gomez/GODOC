
package com.mycompany.proyectgodoc;

import com.mycompany.proyectgodoc.VistaApp.Login;
import org.xml.sax.SAXException;
import com.mycompany.proyectosemestre.LeerDocumento;
import io.github.picodotdev.blogbitix.javapdf.Contrato1;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Main{
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
     
        LeerDocumento leerpdf = new LeerDocumento();
        leerpdf.Leer();
        //Login login = new Login();
        //login.setVisible(true);
       // Contrato1 contrato1 = new Contrato1("elkin", "gomez", "1005038044", "28/11/2022");
       // contrato1.crearPdf();
        
       
        
        
       
    }
}
