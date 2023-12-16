/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package structuras;

import java.util.ArrayList;
//import structuras.tran;


/**
 *
 * @author Rami
 */
public class automata {
    
    private int estadoInicial;
    private ArrayList<Integer> estadosFinal= new ArrayList();
    private ArrayList<tran> transiciones = new ArrayList();
    
    public automata(){
        
    }
    
    public void setEstadoInicial(int estadoInicial){
        this.estadoInicial = estadoInicial;
    }
    
    public int getEstadoInicial(){
        return this.estadoInicial;
    }
    
    public void cambiarEstadoFinal(String nuevoEstado){
        
        for(tran var: this.transiciones){
            if(var.getEstadoActual().equals(String.valueOf(this.getLastEstadoFinal()) ) ){
                var.setEstadoActual(nuevoEstado); 
            }
            
            if(var.getEstadoDestino().equals(String.valueOf(this.getLastEstadoFinal()) ) ){
                var.setEstadoDestino(nuevoEstado); 
            }
        }
        
    }
    
    public void addEstadoFinal(int estadoFinal){
        this.estadosFinal.add(estadoFinal);
    }
    
    public int getLastEstadoFinal(){
        if(this.estadosFinal.size()>0){
            return this.estadosFinal.get(estadosFinal.size()-1);
        }
        return -1;
    }
    
    public void addTransicion(String estadoActual,String caracter,String estadoDestino){
        this.transiciones.add(new tran(estadoActual,caracter,estadoDestino));
    }
    
    public ArrayList getTransiciones(){
        return this.transiciones;
    }
    
    public void addTransicion(tran transicion){
        this.transiciones.add(transicion);
    }
}
