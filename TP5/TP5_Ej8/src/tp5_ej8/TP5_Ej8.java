/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej8;

/**
 *
 * @author Usuario
 */
public class TP5_Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario u = new Usuario("Laura Martínez", "laura@mail.com");
        FirmaDigital f = new FirmaDigital("HASH12345", "2025-09-26", u);
        Documento d = new Documento("Contrato", "Contenido del contrato...", f);

        System.out.println("Usuario de la firma OK: " + (f.getUsuario() == u));
        System.out.println("Firma del documento OK: " + (d.getFirma() == f));
    }
    
}
