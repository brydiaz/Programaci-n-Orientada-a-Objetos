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
public class PerfilAlimenticio {
    
    private ArrayList<String> categoriasQueGusta;
    private ArrayList<String> alergiasAIngredientes;

    public PerfilAlimenticio(ArrayList<String> categoriasQueGusta, ArrayList<String> alergiasAIngredientes) {
        this.categoriasQueGusta = categoriasQueGusta;
        this.alergiasAIngredientes = alergiasAIngredientes;
    }

    public ArrayList<String> getCategoriasQueGusta() {
        return categoriasQueGusta;
    }

    public void setCategoriasQueGusta(ArrayList<String> categoriasQueGusta) {
        this.categoriasQueGusta = categoriasQueGusta;
    }

    public ArrayList<String> getAlergiasAIngredientes() {
        return alergiasAIngredientes;
    }

    public void setAlergiasAIngredientes(ArrayList<String> alergiasAIngredientes) {
        this.alergiasAIngredientes = alergiasAIngredientes;
    }

    @Override
    public String toString() {
        return "Categorias que gusta: " + categoriasQueGusta + " Alergias que posee: " + alergiasAIngredientes;
    }

    
    
}
