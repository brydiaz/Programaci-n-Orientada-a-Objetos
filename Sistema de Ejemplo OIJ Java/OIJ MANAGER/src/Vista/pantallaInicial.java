/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelado.UsuarioGeneral;
import Modelado.UsuarioOIJ;
import Modelado.Usuario;
import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class pantallaInicial extends javax.swing.JFrame {
    
    ArrayList<Usuario> usuariosOIJ;
    ArrayList<Usuario> usuariosNormales;

    public pantallaInicial(ArrayList<Usuario> usuariosOIJ,ArrayList<Usuario> usuariosNormales ) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.usuariosOIJ=usuariosOIJ;
        this.usuariosNormales=usuariosNormales;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginOij1 = new javax.swing.JButton();
        usuarioLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginOij1.setText("ANGENTE OIJ");
        loginOij1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginOij1ActionPerformed(evt);
            }
        });
        getContentPane().add(loginOij1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 140, 30));

        usuarioLogin.setText("USUARIO ");
        usuarioLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioLoginActionPerformed(evt);
            }
        });
        getContentPane().add(usuarioLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vista/pantallaInicial.jpg"))); // NOI18N
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 600));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -10, 570, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginOij1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginOij1ActionPerformed
        // TODO add your handling code here:
        pantallaLoginRegistro loginRegistro= new pantallaLoginRegistro(usuariosOIJ, 1);
        loginRegistro.setVisible(true);
    }//GEN-LAST:event_loginOij1ActionPerformed

    private void usuarioLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioLoginActionPerformed
        // TODO add your handling code here:
        pantallaLoginRegistro loginRegistro= new pantallaLoginRegistro(usuariosNormales, 2);
        loginRegistro.setVisible(true);
        
    }//GEN-LAST:event_usuarioLoginActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginOij1;
    private javax.swing.JButton usuarioLogin;
    // End of variables declaration//GEN-END:variables
}