/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelado;

import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Cliente extends Usuario  {
    
    private String telefono;
    private Integer dinero;
    private ArrayList<Direccion> dondeRecojerPedido;
    private PerfilAlimenticio perfilAlimenticio;
    private ArrayList<Platillo> platillosAcomprar;

    public Cliente(String telefono, Integer dinero, ArrayList<Direccion> dondeRecojerPedido, PerfilAlimenticio perfilAlimenticio, String nombreDeUsuario, String password, String nombre,ArrayList<Platillo> platillosAcomprar) {
        super(nombreDeUsuario, password, nombre);
        this.telefono = telefono;
        this.dinero = dinero;
        this.dondeRecojerPedido = dondeRecojerPedido;
        this.perfilAlimenticio = perfilAlimenticio;
        this.platillosAcomprar= platillosAcomprar;
        this.setTipo("Cliente");
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getDinero() {
        return dinero;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Direccion> getDondeRecojerPedido() {
        return dondeRecojerPedido;
    }

    public void setDondeRecojerPedido(ArrayList<Direccion> dondeRecojerPedido) {
        this.dondeRecojerPedido = dondeRecojerPedido;
    }

    public PerfilAlimenticio getPerfilAlimenticio() {
        return perfilAlimenticio;
    }

    public void setPerfilAlimenticio(PerfilAlimenticio perfilAlimenticio) {
        this.perfilAlimenticio = perfilAlimenticio;
    }

    @Override
    public String toString() {
        return this.getTipo()+":"+" Nombre "+ super.getNombre() + " Telefono:" + telefono + " Dinero Disponible: " + dinero + " Lugares de entrega: " + dondeRecojerPedido + " Perfil Alimenticio: " + perfilAlimenticio ;
    }

    
    
    
    
    
}
