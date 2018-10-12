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
public class Principal {
    public static void main(String[] args) {
        Precio p;
        
        p=new Precio();
        
        Precio m = new Precio('2');
        Precio n = new Precio (25.9);
           
        System.out.println(p.obtener());
        System.out.println(n.obtener());
    }
}
