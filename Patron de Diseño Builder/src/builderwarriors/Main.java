/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderwarriors;

/**
 *
 * @author bryan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GBarbaro bar1= new  GBarbaro();
        GArquera arq1= new GArquera();
        Ejercito ejercito= new Ejercito();
        ejercito.setBuilderGuerrero(bar1);
        ejercito.generarGuerrero();
        System.out.println(ejercito.getBuilderGuerrero().toString());
        
        ejercito.setBuilderGuerrero(arq1);
        ejercito.generarGuerrero();
        System.out.println(ejercito.getBuilderGuerrero().toString());
        
        
    }
    
}
