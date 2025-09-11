/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ej3;

/**
 *
 * @author Usuario
 */
public class TP3_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro aleph = new Libro();
        
        aleph.setAnioPublicacion(-300);
        System.out.println(aleph.getAnioPublicacion());
        aleph.setAnioPublicacion(1971);
        System.out.println(aleph.getAnioPublicacion());
        
    }
    
}
