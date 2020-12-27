    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelado;

import java.util.Date;

/**
 *
 * @author bryan
 */
public class Cuenta {
    
    private String nombre;
    private Integer id;
    private Double balance;
    private Double tasaDeInteresAnual;
    private Date fechaDeCreacion;
    private Double interesPorMes;

    public Cuenta(String nombre, Integer id, Double balance, Double tasaDeInteresAnual, Date fechaDeCreacion) {
        this.nombre=nombre;
        this.id = id;
        this.balance = balance;
        this.tasaDeInteresAnual = tasaDeInteresAnual;
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getTasaDeInteresAnual() {
        return tasaDeInteresAnual;
    }

    public void setTasaDeInteresAnual(Double tasaDeInteresAnual) {
        this.tasaDeInteresAnual = tasaDeInteresAnual;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }
    
    public Double calcularInteresMensual(){
        Double interesMensual;
        interesMensual= this.balance*this.tasaDeInteresAnual;
        this.interesPorMes= interesMensual;
        return interesMensual;
    }
    
    public void retirarDinero(Double dinero){
        this.balance= this.balance-dinero;
    }
    
    public void depositarDinero(Double dinero){
        this.balance= this.balance+dinero;
    }

    @Override
    public String toString() {
        calcularInteresMensual();
        return "Cuenta a nombre de\n" +nombre+"\n" + "ID: "+"\n" + id +"\n"+ "Saldo Actual: \n" + balance + "\n"+ "Con una tasa de interes:\n" + interesPorMes + "\n"+ "Cuenta creada en\n" + fechaDeCreacion;
    }
    
}
