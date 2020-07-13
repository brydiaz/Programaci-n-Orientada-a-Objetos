/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg9hilos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bryan
 */
public class Cajera {
    private String nombre;

    public Cajera(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void procesarCompra(Cliente cliente, long timeStamp){
        long tiempo= (System.currentTimeMillis()-timeStamp)/1000;
        System.out.println("La cajera "+this.nombre+" comienza a procesar la compra "
        + cliente.getNombre()+" en el tiempo "+tiempo+" segundos");
        
        for(int i =0; i<cliente.getCarroCompra().length;i++){
            this.esperarXsegundos(1);
            tiempo= (System.currentTimeMillis()-timeStamp)/1000;
            System.out.println("Procesando producto "+i+" Codigo: "+cliente.getCarroCompra()[i]+" en el tiempo "+tiempo+" segundos");
        }
        tiempo= (System.currentTimeMillis()-timeStamp)/1000;
        System.out.println("La cajera "+this.nombre+" termino de procesar la compra "
        + cliente.getNombre()+" en el tiempo "+tiempo+" segundos");
    }
    private void esperarXsegundos(int segundos){
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cajera.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
