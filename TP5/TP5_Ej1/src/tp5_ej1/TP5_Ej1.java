/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej1;

/**
 *
 * @author Usuario
 */
public class TP5_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Foto f = new Foto("imagen.jpg", "jpg");
        Pasaporte p = new Pasaporte("A1234567", "2025-09-26", f);
        Titular t = new Titular("Juan Perez", "12345678");

        p.asignarTitular(t);

        System.out.println("Relación establecida (tiene pasaporte): " + (t.getPasaporte() == p));
        System.out.println("Relación establecida (titular asignado): " + (p.getTitular() == t));
    }
}
