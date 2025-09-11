/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_ej2;

/**
 *
 * @author Usuario
 */
public class TP3_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota rene = new Mascota();
        
        rene.mostrarInfo();
        rene.nombre = "Rene";
        rene.especie = "Gato";
        rene.edad = 3;
        rene.mostrarInfo();
        
        rene.cumplirAnios();
        rene.cumplirAnios();
        rene.cumplirAnios();
        rene.mostrarInfo();
    }
    
}
