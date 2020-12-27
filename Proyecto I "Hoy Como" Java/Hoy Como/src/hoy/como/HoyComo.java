/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hoy.como;

import java.util.ArrayList;
import modelado.Ingrediente;
import modelado.JSONParse;
import modelado.Platillo;
import modelado.Usuario;
import vista.pantallaMenu;

/**
 *
 * @author bryan
 */
public class HoyComo {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
       ArrayList<Usuario> usuarios= new ArrayList();
       ArrayList<Usuario> clientes= new ArrayList();
       ArrayList<Usuario> cocineros = new ArrayList();       
       ArrayList<Usuario> administradores = new ArrayList();
       ArrayList<Ingrediente> almacen= new ArrayList();
       ArrayList<Platillo> oferta= new ArrayList();
       
       JSONParse parser = new JSONParse();
       usuarios= parser.cargarUsuarios();
       for(int i=0; i<usuarios.size();i++){
           String tipo= usuarios.get(i).getTipo();
           switch(tipo){
               case "Cliente":
                   clientes.add(usuarios.get(i));
                   break;
               case "Cocinero":
                   cocineros.add(usuarios.get(i));
                   break;
               case "Administrador":
                   administradores.add(usuarios.get(i));
                   break;
           }
       }
       almacen= parser.cargarIngredientes();
       oferta= parser.cargarPlatillos(almacen);
       pantallaMenu menu= new pantallaMenu(clientes, cocineros, administradores, almacen, oferta);
       menu.setVisible(true);
    }
    
}
