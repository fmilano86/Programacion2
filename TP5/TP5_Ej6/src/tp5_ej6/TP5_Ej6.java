/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej6;

/**
 *
 * @author Usuario
 */
public class TP5_Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c = new Cliente("Lucía Fernández", "341-5551234");
        Mesa m = new Mesa("10", "4");
        Reserva r = new Reserva("2025-09-30", "21:00", c, m);

        System.out.println("Cliente de la reserva OK: " + (r.getCliente() == c));
        System.out.println("Mesa de la reserva OK: " + (r.getMesa() == m));
    }
    
}
