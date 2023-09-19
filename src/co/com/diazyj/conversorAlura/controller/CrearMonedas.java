/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.diazyj.conversorAlura.controller;

import co.com.diazyj.conversorAlura.model.Moneda;
import java.util.ArrayList;

/**
 *
 * @author Yeferson Javier Diaz
 */
public class CrearMonedas {
    private ArrayList<Moneda> listaMonedas;
    
    public CrearMonedas(){
    listaMonedas = new ArrayList<>();
    listaMonedas.add(new Moneda("Pesos Colombianos", "COP", 1.0));
    listaMonedas.add(new Moneda("Dolares Estadounidenses", "USD", 0.00025));
    listaMonedas.add(new Moneda("Euros", "EUR", 0.00023));
    listaMonedas.add(new Moneda("Yenes Japones", "YEN", 0.036));
    listaMonedas.add(new Moneda("Wones Sur Coreanos", "WON", 0.32));
    }

    public ArrayList<Moneda> getListaMonedas() {
        return listaMonedas;
    }

    public void setListaMonedas(ArrayList<Moneda> listaMonedas) {
        this.listaMonedas = listaMonedas;
    }
    
}
