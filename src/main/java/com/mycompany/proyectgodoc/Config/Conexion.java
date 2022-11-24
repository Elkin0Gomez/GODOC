package com.mycompany.proyectgodoc.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    
    final String bd = "godoc";
    final String url = "jdbc:mysql://localhost:3306/" + bd;
    final String user = "root";
    final String pass = "";
    final String driver = "com.mysql.cj.jdbc.Driver";
    
    
    public Conexion(){
    
    }
    public Connection getConection(){
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(this.url, user, pass);
            System.out.println("Conectando a la bd");
        } catch (SQLException e) {
            System.err.println("e");
        }catch (ClassNotFoundException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    
        return con;
    }
}
