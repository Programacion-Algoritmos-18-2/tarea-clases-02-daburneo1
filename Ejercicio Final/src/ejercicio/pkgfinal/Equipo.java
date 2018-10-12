/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkgfinal;

/**
 *
 * @author David
 */
public class Equipo {

    String nombre;
    int num_jugadores;
    String ciudad;

   
    
    public String obtener_nombre(){
        return nombre;
    }
    public int obtener_num_jugadores(){
        return num_jugadores;
    }
    
    public String obtener_ciudad(){
        return ciudad;
    }
   
    
    public void agregar_nombre (String b){
        nombre = b;
    }
        
    public void agregar_num_jugadores (int a){
        num_jugadores = a;
    }
    
    public void agregar_ciudad (String c){
        ciudad = c;
    }
    
     public Equipo() {
        
    }

    public Equipo(String b) {
        agregar_nombre(b);
    }
    
    public Equipo(String b, int a){
        agregar_nombre(b);
        agregar_num_jugadores(a);
    }
    
    public Equipo(String b, int a, String c){
        agregar_nombre(b);
        agregar_num_jugadores(a);
        agregar_ciudad(c);
    }
}
