/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelado;

import java.util.ArrayList;

/**
 *
 * @author bryan
 */
public class Usuario {
    
    private String nombre;
    private String cedula;
    private Integer id;
    private String password;
    private ArrayList<Denuncia> denunciasHechas;

    public Usuario(String nombre, String cedula, Integer id, String password) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.id = id;
        this.password = password;
        this.denunciasHechas= new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Denuncia> getDenunciasHechas() {
        return denunciasHechas;
    }

    public void setDenunciasHechas(ArrayList<Denuncia> denunciasHechas) {
        this.denunciasHechas = denunciasHechas;
    }

    @Override
    public String toString() {
        return  nombre +"\n"+" Y mi numero de cedula es: "+ cedula +"\n"+"Y mi numero de ID es: "+id+"\n";
    }
    
    
    
    
    
    
    
}
