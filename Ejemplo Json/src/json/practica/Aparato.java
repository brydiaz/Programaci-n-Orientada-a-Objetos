/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json.practica;

/**
 *
 * @author bryan
 */
public abstract class Aparato implements Interruptor {
    private static int contadorAparato=0;
    private String nombre;
    private String marca;
    private Boolean estado;
    private int id;

    public Aparato(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
        this.estado = false;
        this.id = ++contadorAparato;
    }

    @Override
    public String toString() {
        String texto= id+" "+nombre+" "+ marca;
        if(estado){
            texto+= "[on]";
        }else{
            texto+="[off]";
                    
        }
        return texto;
    }
    
    public void encender(){
        this.estado= true;
    }
    public void apagar(){
        this.estado= false; 
    }

    public int getId() {
        return id;
    }
    
    
}
