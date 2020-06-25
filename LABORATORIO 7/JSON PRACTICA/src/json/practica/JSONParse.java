package json.practica;


import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.io.File;
import java.io.IOException;
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
    
    public Controlador cargarAparatos(){
        Controlador controlador= new Controlador();
        ArrayNode aparatos= (ArrayNode) nodo.get("aparatos");
        if(aparatos!=null){
            for (int i=0;i<aparatos.size();i++){
                JsonNode aparato= aparatos.get(i);
                String nombre= aparato.get("nombre").asText();
                String marca= aparato.get("marca").asText();
                String tipo= aparato.get("tipo").asText();
                
                switch(tipo){
                    case "termoregulable":
                        int minima= aparato.get("tempMinima").asInt();
                        int maxima= aparato.get("tempMax").asInt();
                        AparatoTermoRegulable nuevo= new AparatoTermoRegulable(minima, maxima, nombre, marca);
                        controlador.add(nuevo);
                        break;
                    case "modalidades":
                        ArrayNode modalidades= (ArrayNode) aparato.get("modalidades");
                        if(modalidades!=null){
                            String[] modalidad= new String[modalidades.size()];
                            for(int j=0; j<modalidades.size();j++){
                                modalidad[j]=modalidades.get(j).asText();
                            }
                            AparatoConModalidad nuevo2= new AparatoConModalidad(modalidad, nombre, marca);
                            controlador.add(nuevo2);
                        }   
                        break;
                    case "señales":
                        ArrayNode señales= (ArrayNode) aparato.get("señales");
                        if(señales!=null){
                            float[] señal= new float[señales.size()];
                            for(int j=0; j<señales.size();j++){
                                señal[j]=señales.get(j).asLong();
                            }
                            AparatoConSeñal nuevo3= new AparatoConSeñal(señal, nombre, marca);
                            controlador.add(nuevo3);
                        } 
                  
                }
            }
        }
        return controlador;
    }
}
