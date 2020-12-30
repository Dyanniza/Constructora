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
import java.util.ArrayList;
public class Constructora {

    /**
     * @param args the command line arguments
     */
    
    private String nombre;
    //private ArrayList<Empleados> empleados;
    private ArrayList<Obra> obras;
    
    public Constructora(){
        agregarObras();
    }
    
    public void agregarObras()
    {
        obras.add(new Obra("Edificio pinto","Edificio"));
        obras.add(new Obra("Gozales","Casa"));
        obras.add(new Obra("Edificio Portales","Edificio"));
        obras.add(new Obra("Fuentes","Casa"));
        obras.add(new Obra("Edificio Los tiempos","Edificio"));
        obras.add(new Obra("Jimenez","Casa"));
        
        
        
    }
    
    
    
 public ArrayList<Obra> getListaObras(){
        return obras;
 }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
