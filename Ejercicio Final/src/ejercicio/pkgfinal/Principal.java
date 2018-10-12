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
public class Principal {
    public static void main(String[] args) {
        Equipo e1;
        e1= new Equipo();
        System.out.printf("Nombre: %s - Jugadores %s - Ciudad %s\n", e1.obtener_nombre(), e1.obtener_num_jugadores(), e1.obtener_ciudad());
        
        Equipo e2;
        e2= new Equipo();
        e2 = new Equipo("Liga de Loja");
        e2.agregar_num_jugadores(16);
        e2.agregar_ciudad("Loja");
        System.out.printf("\n Nombre: %s - Jugadores %s - Ciudad %s\n", e2.obtener_nombre(), e2.obtener_num_jugadores(), e2.obtener_ciudad());
        
        Equipo e3;
        e3 = new Equipo("Barcelona", 11);
        e3.agregar_ciudad("Guayaquil");
        System.out.printf("\n Nombre: %s - Jugadores %s - Ciudad %s\n", e3.obtener_nombre(), e3.obtener_num_jugadores(), e3.obtener_ciudad());
        
        Equipo e4;
        e4 = new Equipo ("Aucas", 15, "Quito");
        System.out.printf("\n Nombre: %s - Jugadores %s - Ciudad %s\n", e4.obtener_nombre(), e4.obtener_num_jugadores(), e4.obtener_ciudad());
    }
}
