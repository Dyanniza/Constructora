/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora;

/**
 *
 * @author Carlos Alberto
 */
public class Obra {
    
    private String nombre;
    private String tipo;
    
    public Obra(String nomb,String tip){
        
        this.nombre=nomb;
        this.tipo=tip;
    }
    
    public String getNombre(){
        return nombre;
    }
     public String getTipo(){
        return tipo;
    }
    
    
}
