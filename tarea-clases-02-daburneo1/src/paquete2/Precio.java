/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

//import tarea.clases.pkg02.daburneo1.*;

/**
 *
 * @author David
 */
    public class Precio {

    private double euros;   // para trabajar con el dato privado se utilizan los metodos .get(agregar) y .set(obtener)
                            //agregar permite recibir un valor y darle al atributo que yo deseo
   
    public double obtener(){
        
        return euros;  
    }
    
    public void agregar (double x){
        euros = x;
       
    }
}

