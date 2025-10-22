/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej4;

/**
 *
 * @author Usuario
 */
public class TP5_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco b = new Banco("Banco Nación", "30-12345678-9");
        TarjetaDeCredito t = new TarjetaDeCredito("1234-5678-9876-5432", "12/27", b);
        Cliente c = new Cliente("Ana Gómez", "22333444");

        t.asignarCliente(c);

        System.out.println("Cliente de la tarjeta OK: " + (t.getCliente() == c));
        System.out.println("Tarjeta del cliente OK: " + (c.getTarjeta() == t));
    }
    
}
