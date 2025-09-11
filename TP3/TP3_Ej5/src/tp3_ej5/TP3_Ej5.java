/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ej5;

/**
 *
 * @author Usuario
 */
public class TP3_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NaveEspacial k = new NaveEspacial();
        k.recargarCombustible(50);
        
        k.despegar();
        k.avanzar();
        k.mostrarEstado();
        k.recargarCombustible(100);
        k.avanzar();
        k.recargarCombustible(1000);
        k.avanzar();
        k.mostrarEstado();
        
    }
    
}
