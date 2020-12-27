/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderwarriors;

/**
 *
 * Este sería nuestro producto 
 */
public class Guerrero {
    private String categoría;
    private String maneraDeAtacar;
    private int vida;
    private int dañoDeAtaque;

    public String getCategoría() {
        return categoría;
    }

    public void setCategoría(String categoría) {
        this.categoría = categoría;
    }

    public String getManeraDeAtacar() {
        return maneraDeAtacar;
    }

    public void setManeraDeAtacar(String maneraDeAtacar) {
        this.maneraDeAtacar = maneraDeAtacar;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDañoDeAtaque() {
        return dañoDeAtaque;
    }

    public void setDañoDeAtaque(int dañoDeAtaque) {
        this.dañoDeAtaque = dañoDeAtaque;
    }

    @Override
    public String toString() {
        return "Soy un guerrero que se categoriza: "+this.categoría+" Con una vida de: "+this.vida+ " Y ataco de manera: "+this.maneraDeAtacar+"\n";
    }
        
    
    
}
