/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej4;

/**
 *
 * @author Usuario
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;
    
    public void mostrarEstado(){
        System.out.println("ID: " + idGallina + "\nEdad: " + edad + "\nHuevos puestos: " + huevosPuestos);
    }
    
    public void ponerHuevo(){
        huevosPuestos += 1;
    }
    
    public void envejecer(){
        edad += 1;
    }
}
