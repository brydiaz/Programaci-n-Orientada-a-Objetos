/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelado;

import java.util.ArrayList;
import java.util.Base64;

/**
 *
 * @author bryan
 */
public class ClaseApoyo{
    private Usuario cuentaUsuario;
    private int indiceConUsuario=0;
    public ClaseApoyo() {
    }
    
    
    
    public int login(ArrayList<Usuario> baseABuscar, String nombreDeUsuario, String password){
        int c=0;
        while(c!= baseABuscar.size()){
            if(baseABuscar.get(c).getNombreDeUsuario().equals(nombreDeUsuario)){
                byte[] passwordCifrada = Base64.getDecoder().decode(baseABuscar.get(c).getPassword());
                String passwordRecuperada = new String(passwordCifrada);
                if(passwordRecuperada.equals(password)){
                    cuentaUsuario= baseABuscar.get(c);
                    indiceConUsuario= c;
                    return 1;//Encontró la cuenta
                }else{
                    return 2;//Error de contraseña
                }
                
            }
            c++;
        }
        return 3;//No encontró nada 
    }

    public Usuario getCuentaUsuario() {
        return cuentaUsuario;
    }

    public int getIndiceConUsuario() {
        return indiceConUsuario;
    }

    public void setIndiceConUsuario(int indiceConUsuario) {
        this.indiceConUsuario = indiceConUsuario;
    }
    
  
    
}
