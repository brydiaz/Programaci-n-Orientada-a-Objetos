package modelado;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bryan
 */
public class JSONParse {
    
    private File file;
    private ObjectMapper mapper;
    private JsonNode nodo;
    
    public JSONParse(){
        file=new File("Recursos/data.json");
        mapper=new ObjectMapper();
        try {
            nodo= mapper.readTree(file);
        } catch (IOException ex) {
            Logger.getLogger(JSONParse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Controlador cargarUsuarios(){
        Controlador controlador= new Controlador();
        ArrayNode usuarios= (ArrayNode) nodo.get("usuarios");
        if(usuarios!=null){
            for (int i=0;i<usuarios.size();i++){
                JsonNode usuario= usuarios.get(i);
                String nombre= usuario.get("nombre").asText();
                String nombreDeUsuario= usuario.get("usuario").asText();
                String password= usuario.get("password").asText();
                String tipo=  usuario.get("tipo").asText();
                String passwordCodificada = Base64.getEncoder().encodeToString(password.getBytes());

                switch(tipo){
                    case "Cliente":
                        int dinero= usuario.get("dinero").asInt();
                        String numeroDeTelefono= usuario.get("telefono").asText();
                        ArrayList<String> gusto= new ArrayList();
                        ArrayList<String> alergia= new ArrayList();
                        ArrayList<Direccion> direcciones1= new ArrayList();
                        ArrayNode gustos= (ArrayNode) usuario.get("gustos");
                        ArrayNode alergias= (ArrayNode) usuario.get("alergias");
                        ArrayNode direcciones= (ArrayNode) usuario.get("direccion");
                        if(gustos!=null){
                            for(int j=0; j<gustos.size();j++){
                                gusto.add(gustos.get(j).asText());
                            }
                        }
                        if(alergias!=null){
                            for(int j=0; j<alergias.size();j++){
                                alergia.add(alergias.get(j).asText());
                            }
                        }
                        if(direcciones!=null){
                            for(int j=0; j<direcciones.size();j++){
                                double latitud= direcciones.get(j).get(0).asDouble();
                                double longitud= direcciones.get(j).get(1).asDouble();
                                String direc= direcciones.get(j).get(2).asText();
                                Direccion nuevaDireccion= new Direccion(direc, latitud, longitud);
                                direcciones1.add(nuevaDireccion);
                            }
                        }
                        PerfilAlimenticio perfil= new PerfilAlimenticio(gusto,alergia);
                        ArrayList<Platillo> platillosAComprar= new ArrayList();
                        Cliente nuevo= new Cliente(numeroDeTelefono, dinero, direcciones1, perfil, nombreDeUsuario, passwordCodificada, nombre, platillosAComprar);
                        controlador.add(nuevo);
                        break;
                    case "Cocinero":
                        Cocinero nuevo2= new Cocinero(nombreDeUsuario, passwordCodificada, nombre);
                        controlador.add(nuevo2);
                        break;
                    case "Administrador":
                        Administrador nuevo3= new Administrador(nombreDeUsuario, passwordCodificada, nombre);
                        controlador.add(nuevo3);
                        break;
                }
            }
        }
        return controlador;
    }
    
    
    public ArrayList<Ingrediente> cargarIngredientes(){
         ArrayList<Ingrediente> despensa= new ArrayList();
         ArrayNode ingredientes= (ArrayNode) nodo.get("ingredientes");
          if(ingredientes!=null){
            for (int i=0;i<ingredientes.size();i++){
                JsonNode ingrediente= ingredientes.get(i);
                String nombre= ingrediente.get("nombre").asText();
                Integer cantidad= ingrediente.get("cantidad").asInt();
                Integer costo= ingrediente.get("costo").asInt();
                String unidad= ingrediente.get("unidad").asText();
                ArrayList<String> tipos= new ArrayList();
                ArrayNode tiposDeIngre= (ArrayNode) ingrediente.get("tiposDeIngrediente");
                for(int k=0; k<tiposDeIngre.size();k++){
                    tipos.add(tiposDeIngre.get(k).asText());
                }
                boolean animalConPesuña;
                boolean gluten;
                String animal= ingrediente.get("animalConPeseña").asText();
                String gluten1= ingrediente.get("gluten").asText();
                
                if(animal.equals("false")){
                    animalConPesuña=false;
                }else{
                    animalConPesuña=true;
                }
                if(gluten1.equals("false")){
                    gluten=false;
                }else{
                    gluten=true;
                }
                
                Ingrediente nuevo= new Ingrediente(nombre, cantidad, unidad, tipos, animalConPesuña, gluten, costo);
                despensa.add(nuevo);
            }
    }
          return despensa;
    }
    
    public ArrayList<Platillo> cargarPlatillos(ArrayList<Ingrediente> despensa){
        ArrayList<Platillo> menu= new ArrayList();
        ArrayNode platillos= (ArrayNode) nodo.get("platillos");
        if(platillos!=null){
            for (int i=0;i<platillos.size();i++){
                JsonNode platillo= platillos.get(i);
                String nombre= platillo.get("nombre").asText();
                String receta= platillo.get("receta").asText();
                String tipo= platillo.get("tipo").asText();
                ArrayList<String> ingredientesABuscar= new ArrayList();
                ArrayList<Ingrediente> ingredientesDePlatillo= new ArrayList();
                ArrayNode ingreDePlatillos= (ArrayNode) platillo.get("ingredientes");
                for(int k=0; k<ingreDePlatillos.size();k++){
                    ingredientesABuscar.add(ingreDePlatillos.get(k).asText());
                }
                for(int j=0;j<ingredientesABuscar.size();j++){
                    for(int h=0;h<despensa.size();h++){
                        if(ingredientesABuscar.get(j).equals(despensa.get(h).getNombre())){
                            ingredientesDePlatillo.add(despensa.get(h));
                        }
                    }
                }
                Platillo nuevo= new Platillo(ingredientesDePlatillo, nombre, receta, tipo);
                menu.add(nuevo);
            }
    }
        return menu;
    }
}
