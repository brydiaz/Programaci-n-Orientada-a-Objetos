/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelado;

import Vista.pantallaInicial;
import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class OIJ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Usuario> angentes= new ArrayList();
        ArrayList<Usuario> ususariosGenerales= new ArrayList();
        pantallaInicial interfaz = new pantallaInicial(angentes, ususariosGenerales);
        interfaz.setVisible(true);
    }
    
}
