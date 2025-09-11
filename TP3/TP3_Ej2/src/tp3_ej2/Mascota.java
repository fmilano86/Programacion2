/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_ej2;

/**
 *
 * @author Usuario
 */
public class Mascota {
    String nombre;
    String especie;
    int edad;
    
    void mostrarInfo(){
        System.out.println("Nombre: " + nombre + "\nEspecie: " + especie + "\nEdad: " + edad);
    }
    
    void cumplirAnios(){
        edad += 1;
    }
}
