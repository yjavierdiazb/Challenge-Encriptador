/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.diazyj.conversorAlura.view;

import co.com.diazyj.conversorAlura.controller.CrearMonedas;
import co.com.diazyj.conversorAlura.model.Moneda;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class test {
    CrearMonedas creadorMonedas = new CrearMonedas();
    ArrayList<Moneda> listaMonedas = creadorMonedas.getListaMonedas();
    String[] nombresMonedas = new String[listaMonedas.size()];
    
    public test(){
    for (int i = 0; i < listaMonedas.size(); i++) {
            nombresMonedas[i] = listaMonedas.get(i).getNombre();
        }}
  
    public static void main(String[] args) {
        test test = new test();
        for(String nombre: test.nombresMonedas){
            System.out.println(nombre);}
    }
    
    
    
}
