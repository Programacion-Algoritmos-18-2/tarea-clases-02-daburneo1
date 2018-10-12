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
public class Principal {
    public static void main(String[] args) {
        Precio p;
        
        p=new Precio();
        
            //System.out.println(p.euros);
            //p.euros=10.1;
            //System.out.println(p.euros);
            //Inservible ya que euros es dato privado
            
            p.agregar(20.2);
            System.out.println(p.obtener());
    }
}
