/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelado.Cuenta;
import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class MainView extends javax.swing.JFrame {
    
    ArrayList<Cuenta> cuenta;
    /**
     * Creates new form MainView
     */
    public MainView(ArrayList<Cuenta> cuentas) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.cuenta=cuentas;
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newAcountButton = new javax.swing.JButton();
        loginButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newAcountButton.setText("CREATE ACOUNT");
        newAcountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAcountButtonActionPerformed(evt);
            }
        });
        getContentPane().add(newAcountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 235, 160, -1));

        loginButton.setText("LOGIN");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(173, 174, 155, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/bryan/NetBeansProjects/B-ATM/IMAGENES/inicio.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 540, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        loginView login= new loginView(cuenta);
        login.setVisible(true);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void newAcountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAcountButtonActionPerformed
        // TODO add your handling code here:
        CreateAccountView nuevaCuenta= new CreateAccountView(this, cuenta);
        nuevaCuenta.setVisible(true);
    }//GEN-LAST:event_newAcountButtonActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton newAcountButton;
    // End of variables declaration//GEN-END:variables
}
