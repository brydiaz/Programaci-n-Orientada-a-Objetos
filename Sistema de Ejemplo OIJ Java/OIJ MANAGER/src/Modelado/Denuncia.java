/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelado;

import java.util.Date;

/**
 *
 * @author bryan
 */
public class Denuncia {
    
    private Usuario usuarioQueDenuncio;
    private String causa;
    private Date fecha;
    private String Hora;

    public Denuncia(Usuario usuarioQueDenuncio, String causa, Date fecha, String Hora) {
        this.usuarioQueDenuncio = usuarioQueDenuncio;
        this.causa = causa;
        this.fecha = fecha;
        this.Hora = Hora;
    }

    public Usuario getUsuarioQueDenuncio() {
        return usuarioQueDenuncio;
    }

    public void setUsuarioQueDenuncio(Usuario usuarioQueDenuncio) {
        this.usuarioQueDenuncio = usuarioQueDenuncio;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    @Override
    public String toString() {
        return "Denuncia a nombre de: " +usuarioQueDenuncio.toString() +"\n "+ "Causa de la denuncia: "+ causa + "\n" + "Causada en: "+ fecha +"\n"+ "A las: " + Hora +"\n";
    }
    
    
    
}
