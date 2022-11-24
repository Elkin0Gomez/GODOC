package com.mycompany.proyectgodoc.Dao;

import com.mycompany.proyectgodoc.Config.Conexion;
import com.mycompany.proyectgodoc.Modelo.Asesor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LoginDao extends Conexion{
    
    public boolean guardar (Asesor as){
    
        Connection con = getConection();
        PreparedStatement ps;
        String sql = "INSERT INTO asesor (documento, nombre, apellido, correo, contraseña, rol) VALUES (?,?,?,?,?,?) ";
        
        String rol = "user";
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, as.getDocumento());
            ps.setString(2, as.getNombre());
            ps.setString(3, as.getApellido());
            ps.setString(4, as.getCorreo());
            ps.setString(5, as.getContraseña());
            ps.setString(5, rol);
            
            return true;
            
        } catch (Exception ex) {
            
            System.err.println(ex);
            return false;
            
        }
    
    }
    
    public boolean ingresar (String user,String pass){
    
        Connection con = getConection();
        PreparedStatement ps = null;
        ResultSet rs;
        String sql = "SELECT id, correo, contraseña FROM asesor WHERE correo = '"+user+"' AND contraseña = '"+pass+"'";
        
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            if (rs.next())
            {
            
                return true;
            }else
            {
            
                return false;
            }
         
        } catch (Exception ex)
        {
            System.err.println(ex);
            return false;
            
        }finally
        {
        
            try {
                con.close();
            } catch (SQLException ex) 
            {
                Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE, null, ex);
                
            }
        
        }
        
    }
    
    
}
