/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Modelado.Cuenta;
import Vista.MainView;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bryan
 */
public class ATM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Cuenta> cuentas= new ArrayList();
        Date fecha= new Date(2020, 05, 23);
        Cuenta cuentaDefaul= new Cuenta("Ana", 01 , 100000.0,0.045, fecha);
        cuentas.add(cuentaDefaul);
        MainView pantalla= new MainView(cuentas);
        pantalla.setVisible(true);
    }
    
}
