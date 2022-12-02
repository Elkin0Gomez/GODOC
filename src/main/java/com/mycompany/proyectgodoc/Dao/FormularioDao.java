
package com.mycompany.proyectgodoc.Dao;

import com.mycompany.proyectgodoc.Config.Conexion;
import com.mycompany.proyectgodoc.Modelo.Contratista;
import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


    
public class FormularioDao extends Conexion{
    
    
    public boolean guardar (Contratista cont ){
            
        
            Conexion abcd = new Conexion();
            //Connection con = getConection();
            Connection con = abcd.getConection();
            PreparedStatement ps = null;
            
            String sql = "INSERT INTO contrato (nombre, apellido, cedula, direccion, lugarExpedicion,valorContrato, fechainicio, fechaFin, fechaContrato ) VALUES (?,?,?,?,?,?,?,?,?)";
        try {   
            //ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            ps.setString(1, cont.getNombre() );
            ps.setString(2, cont.getApellido());
            ps.setString(3, cont.getCedula());
            ps.setString(4, cont.getDireccion());
            ps.setString(5, cont.getLugarExpedicion());
            ps.setString(6, cont.getValorContrato());
            ps.setString(7, cont.getFechaInicio());
            ps.setString(8, cont.getFechaFin());
            ps.setString(9, cont.getFechaContrato());
            
            ps.executeUpdate();
            return true;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(FormularioDao.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;
        } /*finally {
        
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(FormularioDao.class.getName()).log(Level.SEVERE, null, ex);
}
        }*/
        
        
    }
    
    public List Mostrar (String buscar ){
        
            Connection con = getConection();
            PreparedStatement ps = null;
            ResultSet rs = null;
            
            List<Contratista> datos = new ArrayList<>();
            String sql = "SELECT * FROM contrato WHERE nombre LIKE '"+buscar+"' OR cedula LIKE '"+buscar+"'" ;
            
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                
                Contratista cont = new Contratista();
                
                cont.setId(rs.getInt(1));
                cont.setNombre(rs.getString(2));
                cont.setApellido(rs.getString(3));
                cont.setCedula(rs.getString(4));
                cont.setDireccion(rs.getString(5));
                cont.setLugarExpedicion(rs.getString(6));
                cont.setValorContrato(rs.getString(7));
                cont.setFechaInicio(rs.getString(8));
                cont.setFechaFin(rs.getString(9));
                cont.setFechaContrato(rs.getString(10));
                datos.add(cont);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(FormularioDao.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(FormularioDao.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
            
            return datos;
            
    }   
}

