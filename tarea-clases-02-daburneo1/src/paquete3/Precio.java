/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

//import tarea.clases.pkg02.daburneo1.*;

//import paquete2.*;
//import tarea.clases.pkg02.daburneo1.*;

/**
 *
 * @author David
 */
    public class Precio {

    private double euros;   
   
    public double obtener(){
        
        return euros;  
    }
    
    public void agregar (double x){
        euros = x;
       
    }
    public Precio(){
        agregar(30.2);
    }
    
    public Precio (double y){
        agregar (y);
    }
    
}

