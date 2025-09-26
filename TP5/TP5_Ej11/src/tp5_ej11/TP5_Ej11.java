/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej11;

/**
 *
 * @author Usuario
 */
public class TP5_Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Artista a = new Artista("Soda Stereo", "Rock");
        Cancion c = new Cancion("De música ligera", a);
        Reproductor r = new Reproductor();

        r.reproducir(c);
    }
    
}
