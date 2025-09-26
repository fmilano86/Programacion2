/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej13;

/**
 *
 * @author Usuario
 */
public class TP5_Ej13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u = new Usuario("Carla López", "carla@mail.com");
        GeneradorQR g = new GeneradorQR();

        g.generar("ABC123XYZ", u);
    }
    
}
