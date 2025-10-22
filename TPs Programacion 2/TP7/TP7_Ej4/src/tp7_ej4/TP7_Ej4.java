/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7_ej4;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class TP7_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Michi"));
        animales.add(new Vaca("Lola"));

        System.out.println("Sonidos de los animales:\n");

        
        for (Animal a : animales) {
            a.describirAnimal();
        }
    }
}
    

