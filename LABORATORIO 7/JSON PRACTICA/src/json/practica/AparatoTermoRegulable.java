/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json.practica;

/**
 *
 * @author bryan
 */
public class AparatoTermoRegulable extends Aparato {
    private int tempMinima;
    private int tempMax;
    private int tempActual;


    public AparatoTermoRegulable(int tempMinima, int tempMax,String nombre, String marca) {
        super(nombre, marca);
        this.tempMinima = tempMinima;
        this.tempMax = tempMax;
    }

    @Override
    public void encender() {
        super.encender();
        this.tempActual=(tempMinima+tempMax)/2;
        System.out.println(super.toString()+ "Con una temperatura de "+ tempActual+ "grados"); 
    }
    
    @Override
    public void apagar() {
        super.apagar();
        System.out.println(super.toString()); 
   }
    
    
    
}
