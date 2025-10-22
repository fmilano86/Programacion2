/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp7_ej4;

/**
 *
 * @author Usuario
 */
public class Vaca extends Animal{
    public Vaca(String nombre) {
        super(nombre);
    }

    @Override
    public String hacerSonido() {
        return "muge: ¡Muuu!";
    }
}
