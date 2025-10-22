/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej5;

/**
 *
 * @author Usuario
 */
public class TP5_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlacaMadre pm = new PlacaMadre("ASUS-B450", "B450");
        Computadora compu = new Computadora("Lenovo", "SN123456", pm);
        Propietario p = new Propietario("Carlos Ruiz", "33444555");

        compu.asignarPropietario(p);

        System.out.println("Propietario de la computadora OK: " + (compu.getPropietario() == p));
        System.out.println("Computadora del propietario OK: " + (p.getComputadora() == compu));
    }
    
}
