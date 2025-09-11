/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej5;

/**
 *
 * @author Usuario
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private int posicion;
    
    public void mostrarEstado(){
        System.out.println("Nombre: " + nombre + "\nCombustible: " + combustible + "\nPosicion: " + posicion);
    }
    
    public void despegar(){
        if ((posicion == 0) && (combustible >= 50)){
            posicion += 1;
            combustible -= 50;
        }    
    }
    
    public void recargarCombustible(int cantidad){
        if (cantidad >= 0){
            combustible += cantidad;
        }
        if (combustible > 500){
            combustible = 500;
        }
    }
    
    public void avanzar(){
        if (combustible >= 50){
            posicion += 1;
            combustible -= 50;
        }
    }
}
