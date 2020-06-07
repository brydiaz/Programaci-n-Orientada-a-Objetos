/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelado;

/**
 *
 * @author bryan
 */
public class UsuarioOIJ extends Usuario{
    
    private String carnet;
    private String cargo;

    public UsuarioOIJ(String carnet, String cargo, String nombre, String cedula, Integer id, String password) {
        super(nombre, cedula, id, password);
        this.carnet = carnet;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.getNombre() +"\n"+" Y mi numero de cedula es: "+ super.getCedula() +"\n"+"Y mi numero de ID es: "+super.getId()+"\n" + "Con el cargo de: "+cargo+"\n"+"Y mi numero de carnet es: "+carnet+"\n";
    }
    
    
}
