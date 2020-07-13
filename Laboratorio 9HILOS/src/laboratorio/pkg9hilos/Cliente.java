/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg9hilos;

import java.util.Random;

/**
 *
 * @author bryan
 */
public class Cliente {
    private final int MIN_TAMAÑO_CARRITO=10;
    private final int ADICIONAL_TAMAÑO_CARRITO=5;
    private final int MAX_CODIGO_PRODUCTO=100;
    
    private String nombre;
    private int[] carroCompra;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getCarroCompra() {
        return carroCompra;
    }

    public Cliente(String nombre) {
        this.nombre = nombre;
        Random r= new Random();
        int tamañoCarroCompra= MIN_TAMAÑO_CARRITO+r.nextInt(ADICIONAL_TAMAÑO_CARRITO);
        carroCompra= new int[tamañoCarroCompra];
        for(int i=0;i<carroCompra.length;i++){
            carroCompra[i]= r.nextInt(MAX_CODIGO_PRODUCTO+1);
            System.out.println(carroCompra[i]);
        }
    }
    
    


}
