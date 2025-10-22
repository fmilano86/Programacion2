/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7_ej4;

/**
 *
 * @author Usuario
 */
public class Perro extends Animal{
     public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "ladra: ¡Guau guau!";
    }
}
