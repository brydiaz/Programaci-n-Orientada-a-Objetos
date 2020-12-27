/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json.practica;

import java.util.Random;

/**
 *
 * @author bryan
 */
public class AparatoConSeñal extends Aparato {
    private float[] señales;
    private float señalActual;

    public AparatoConSeñal(float[] señañles, String nombre, String marca) {
        super(nombre, marca);
        this.señales = señañles;

    }

    @Override
    public void apagar() {
        super.apagar(); //To change body of generated methods, choose Tools | Templates.
        super.toString();
    }

    @Override
    public void encender() {
        super.encender(); //To change body of generated methods, choose Tools | Templates.
        Random ran= new Random();
        int random= ran.nextInt(señales.length);
        this.señalActual= señales[random];
        System.out.println(super.toString()+" Señal actual "+ señalActual);
    }

  

    

    
    
}
