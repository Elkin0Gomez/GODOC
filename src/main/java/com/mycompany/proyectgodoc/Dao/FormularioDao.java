
package com.mycompany.proyectgodoc.Dao;

import com.mycompany.proyectgodoc.Config.Conexion;
import com.mycompany.proyectgodoc.Modelo.Contratista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FormularioDao extends Conexion{
    
    public boolean guardar (Contratista cont ){
        
            Connection con = getConection();
            PreparedStatement ps = null;
            
            String sql = "INSERT INTO contrato (nombre, apellido, cedula, lugarExpedicion,valorContrato, fechainicio, fechaFin, fechaContrato ) VALUES (?,?,?,?,?,?,?,?,?)";
        try {   
            ps = con.prepareStatement(sql);
            ps.setString(1, cont.getNombre() );
            ps.setString(2, cont.getApellido());
            ps.setString(3, cont.getCedula());
            ps.setString(4, cont.getLugarExpedicion());
            ps.setString(5, cont.getValorContrato());
            ps.setString(6, cont.getFechaInicio());
            ps.setString(7, cont.getFechaFin());
            ps.setString(8, cont.getFechaContrato());
            
            ps.execute();
            return true;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FormularioDao.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        } finally {
        
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(FormularioDao.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
        
        
    }
    
}
