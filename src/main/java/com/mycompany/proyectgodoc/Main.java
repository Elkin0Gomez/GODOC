
package com.mycompany.proyectgodoc;


import com.mycompany.proyectgodoc.Modelo.ContratoNoColombianos;
import com.mycompany.proyectgodoc.VistaApp.Login;
import java.io.FileNotFoundException;
import java.io.IOException;



public class Main{
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
     
        //Login login = new Login();
        //login.setVisible(true);
        ContratoNoColombianos contratoNoColombianos = new ContratoNoColombianos();
        contratoNoColombianos.GenerarPDF();

    }
}
