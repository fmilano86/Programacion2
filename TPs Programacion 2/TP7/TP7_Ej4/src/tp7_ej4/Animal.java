/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7_ej4;

/**
 *
 * @author Usuario
 */
public class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    
    public String hacerSonido() {
        return "Hace un sonido genérico";
    }

  
    public void describirAnimal() {
        System.out.println("El animal " + nombre + " " + hacerSonido());
    }
}
