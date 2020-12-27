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
public class AparatoConModalidad extends Aparato{
    private String[] modalidades;
    private String modalidadActual;

    public AparatoConModalidad(String[] modalidades, String nombre, String marca) {
        super(nombre, marca);
        this.modalidades = modalidades;

    }

    @Override
    public void apagar() {
        super.apagar(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(super.toString());
    }

    @Override
    public void encender() {
        super.encender(); //To change body of generated methods, choose Tools | Templates.
        this.modalidadActual= modalidades[0];
        System.out.println(super.toString()+" En modalidad "+this.modalidadActual);
    }
    
    
}
