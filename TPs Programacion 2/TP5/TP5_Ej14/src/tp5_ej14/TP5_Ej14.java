/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej14;

/**
 *
 * @author Usuario
 */
public class TP5_Ej14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Proyecto p = new Proyecto("Corto Animado", "15");
        EditorVideo ev = new EditorVideo();

        ev.exportar("MP4", p);
    }
    
}
