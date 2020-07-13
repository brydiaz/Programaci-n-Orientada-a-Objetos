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
public class CajeraThread extends Thread{
    private String nombre;
    private Cliente cliente;
    private long tiempoInicial;

    public CajeraThread(String nombre, Cliente cliente, long tiempoInicial) {
        super();
        this.nombre = nombre;
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }

    @Override
    public void run() {
         long tiempo= (System.currentTimeMillis()-this.tiempoInicial)/1000;
        System.out.println("La cajera "+this.nombre+" comienza a procesar la compra "
        + cliente.getNombre()+" en el tiempo "+tiempo+" segundos");
        
        for(int i =0; i<cliente.getCarroCompra().length;i++){
            this.esperarXsegundos(1);
            tiempo= (System.currentTimeMillis()-this.tiempoInicial)/1000;
            System.out.println("Procesando producto "+i+" Codigo: "+cliente.getCarroCompra()[i]+" en el tiempo "+tiempo+" segundos");
        }
        tiempo= (System.currentTimeMillis()-this.tiempoInicial)/1000;
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
