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
public class Platillo {
    
    private ArrayList<Ingrediente> ingredientes;
    private String nombre;
    private String receta;
    private String tipo;
    private Integer costo=0;
    private Integer cantidad=0;

    public Platillo(ArrayList<Ingrediente> ingredientes, String nombre, String receta, String tipo) {
        this.ingredientes = ingredientes;
        this.nombre = nombre;
        this.receta = receta;
        this.tipo=tipo;
        calcularCosto();
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    @Override
    public String toString() {
        return nombre+"\n"+"Con un costo de: "+costo+" De tipo: "+tipo+" Ingredientes: "+this.ingredientes.toString()+"\n"+"\n";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getCosto() {
        return costo;
    }

    public void setCosto(Integer costo) {
        this.costo = costo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
    
    

    public void calcularCosto(){
        for(int i=0; i<this.ingredientes.size();i++){
            this.costo= this.costo+ingredientes.get(i).getCosto()*ingredientes.get(i).getCantidad();
        }
    }
    
    
}
