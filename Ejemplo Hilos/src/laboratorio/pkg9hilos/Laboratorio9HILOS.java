/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg9hilos;

/**
 *
 * @author bryan
 */
public class Laboratorio9HILOS {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Cliente c1= new Cliente("Bryan");
        Cajera ca1= new Cajera("Karla");
        long initialTime= System.currentTimeMillis();
        ca1.procesarCompra(c1, initialTime);
        */
        Cliente cliente= new Cliente("Bryan");
        Cliente cliente2= new Cliente("Jose");
        long initialTime= System.currentTimeMillis();
    
        CajeraThread cajera= new CajeraThread("Marta", cliente, initialTime);
        CajeraThread cajero= new CajeraThread("Carlos", cliente2, initialTime);
    
        cajera.start();

    }
   

}
