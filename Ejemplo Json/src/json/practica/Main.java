/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package json.practica;

import java.util.Scanner;

/**
 *
 * @author bryan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JSONParse parser = new JSONParse();
        Controlador controlador = parser.cargarAparatos();
        Scanner reader = new Scanner(System.in);
        Aparato nuevo;
        boolean live=true;
        while(live){
            System.out.println("Deseas 1.Encender o 2.Apagar un aparato? 3. No");
            int op1= reader.nextInt();  
            int i=0;
            switch(op1){
           
                case 1:
                    System.out.println("Digite el id, recuerde solo de 0 a 10");
                    int id= reader.nextInt();
                    while(i!=controlador.size()){
                        if(id==controlador.get(i).getId()){
                            nuevo=controlador.get(i);
                            nuevo.encender();
                        }
                        i++;
                    }
                    i=0;
                    break;
                case 2:
                    System.out.println("Digite el id, recuerde solo de 0 a 10");
                    int id2= reader.nextInt();
                    while(i!=controlador.size()){
                        if(id2==controlador.get(i).getId()){
                            nuevo=controlador.get(i);
                            nuevo.apagar();
                        }
                        i++;
                    }
                    i=0;
                    break;       
                case 3:
                    System.out.println("Gracias!");
                    live=false;
                    break;
            }
        }
    }
}
