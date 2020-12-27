/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelado;

/**
 *
 * @author bryan
 */
public class Usuario {
    private String nombreDeUsuario;
    private String password;
    private String nombre;
    private String tipo;
    public Usuario(String nombreDeUsuario, String password, String nombre) {
        this.nombreDeUsuario = nombreDeUsuario;
        this.password = password;
        this.nombre=nombre;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }
    

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo+"/" + " Nombre de usuario: " + nombreDeUsuario + " Nombre:" + nombre;
    }
    
    
    
    
}
