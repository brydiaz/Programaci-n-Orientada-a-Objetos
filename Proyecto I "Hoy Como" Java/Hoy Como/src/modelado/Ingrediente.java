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
public class Ingrediente {
    
    private String nombre;
    private Integer cantidad;
    private String medida;
    private ArrayList<String> tiposDeIngrediente;
    private Integer costo;
    private boolean animalConPesuña;
    private boolean gluten;

    public Ingrediente(String nombre, Integer cantidad, String medida, ArrayList<String> tiposDeIngrediente, boolean animalConPesuña, boolean gluten, Integer costo) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.medida = medida;
        this.tiposDeIngrediente = tiposDeIngrediente;
        this.animalConPesuña=animalConPesuña;
        this.costo=costo;
        this.gluten= gluten;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getMedida() {
        return medida;
    }

    public void setMedida(String medida) {
        this.medida = medida;
    }

    public ArrayList<String> getTiposDeIngrediente() {
        return tiposDeIngrediente;
    }

    public void setTiposDeIngrediente(ArrayList<String> tiposDeIngrediente) {
        this.tiposDeIngrediente = tiposDeIngrediente;
    }

    public boolean isAnimalConPesuña() {
        return animalConPesuña;
    }

    public void setAnimalConPesuña(boolean animalConPesuña) {
        this.animalConPesuña = animalConPesuña;
    }

    public boolean isGluten() {
        return gluten;
    }

    public void setGluten(boolean gluten) {
        this.gluten = gluten;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

 

    @Override
    public String toString() {
        return nombre+" "+ cantidad+ " " +medida+ tiposDeIngrediente.toString()+costo+"\n";
    }
    
    
    
    
}
