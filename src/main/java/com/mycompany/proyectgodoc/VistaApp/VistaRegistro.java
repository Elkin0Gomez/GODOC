/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectgodoc.VistaApp;

import com.mycompany.proyectgodoc.Dao.LoginDao;
import com.mycompany.proyectgodoc.Modelo.Asesor;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class VistaRegistro extends javax.swing.JFrame {

    /**
     * Creates new form VistaRegistro
     */
    public VistaRegistro() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLNombreRe = new javax.swing.JLabel();
        jTextNombreRe = new javax.swing.JTextField();
        jTextApellidoRe = new javax.swing.JTextField();
        jTextDocuRe = new javax.swing.JTextField();
        jTextCorreoRe = new javax.swing.JTextField();
        jTextContraRe = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextRol = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Users\\USUARIO\\Pictures\\Screenshots\\2.PNG")); // NOI18N
        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLNombreRe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLNombreRe.setForeground(new java.awt.Color(0, 0, 0));
        jLNombreRe.setText("Nombres");
        jPanel1.add(jLNombreRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, -1, -1));

        jTextNombreRe.setBackground(new java.awt.Color(255, 255, 255));
        jTextNombreRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreReActionPerformed(evt);
            }
        });
        jPanel1.add(jTextNombreRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 190, -1));

        jTextApellidoRe.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextApellidoRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 190, -1));

        jTextDocuRe.setBackground(new java.awt.Color(255, 255, 255));
        jTextDocuRe.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextDocuRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 190, -1));

        jTextCorreoRe.setBackground(new java.awt.Color(255, 255, 255));
        jTextCorreoRe.setForeground(new java.awt.Color(0, 0, 0));
        jTextCorreoRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCorreoReActionPerformed(evt);
            }
        });
        jPanel1.add(jTextCorreoRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 200, -1));

        jTextContraRe.setBackground(new java.awt.Color(255, 255, 255));
        jTextContraRe.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jTextContraRe, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 200, -1));

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("REGISTRAR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 100, 30));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Volver");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 100, 30));

        jTextRol.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jTextRol, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 290, 200, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Rol");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contraseña");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Correo");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Documento");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellidos");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, -1, -1));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon("D:\\Users\\USUARIO\\Pictures\\Screenshots\\version3.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreReActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreReActionPerformed

    private void jTextCorreoReActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCorreoReActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCorreoReActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        Login login = new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        LoginDao loginDao = new LoginDao();
        Asesor as = new Asesor();
        
        as.setNombre(jLNombreRe.getText());
        as.setApellido(jTextApellidoRe.getText());
        as.setDocumento(jTextDocuRe.getText());
        as.setCorreo(jTextCorreoRe.getText());
        as.setContraseña(jTextContraRe.getText());
        as.setRol(jTextRol.getText());
        
        
        if (loginDao.registrar(as))
        {
            JOptionPane.showMessageDialog(null, "REGISTRADO CON EXITO");
            
        
        }else 
        
        {
            JOptionPane.showMessageDialog(null, "ERROR AL REGISTRARSE");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLNombreRe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField jTextApellidoRe;
    public javax.swing.JTextField jTextContraRe;
    public javax.swing.JTextField jTextCorreoRe;
    public javax.swing.JTextField jTextDocuRe;
    public javax.swing.JTextField jTextNombreRe;
    public javax.swing.JTextField jTextRol;
    // End of variables declaration//GEN-END:variables
}
