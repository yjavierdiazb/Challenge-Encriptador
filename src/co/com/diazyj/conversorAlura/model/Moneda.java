/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.diazyj.conversorAlura.model;

/**
 *
 * @author Yeferson Diaz
 */

//Se define las propiedades del objeto Moneda

public class Moneda {
    private String nombre;
    private String codigo;
    private double tasaCambio;

// Getters and Setters    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getTasaCambio() {
        return tasaCambio;
    }

    public void setTasaCambio(double tasaCambio) {
        this.tasaCambio = tasaCambio;
    }

    //Se hace el constructor
    
    public Moneda(String nombre, String codigo, double tasaCambio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.tasaCambio = tasaCambio;
    }    
}
