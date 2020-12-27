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
public class DenunciaGeografica extends Denuncia{
    
   private Double latitud;
   private Double longitud;

    public DenunciaGeografica(Double latitud, Double longitud, Usuario usuarioQueDenuncio, String causa, Date fecha, String Hora) {
        super(usuarioQueDenuncio, causa, fecha, Hora);
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Denuncia a nombre de: " +super.getUsuarioQueDenuncio().toString() +"\n "+ "Causa de la denuncia: "+ super.getCausa() + "\n" + "Causada en: "+ super.getFecha() +"\n"+ "A las: " + super.getHora() +"\n"+"En X: "+latitud+"\n"+"En Y: "+longitud+"\n";

    }
   
   
}
