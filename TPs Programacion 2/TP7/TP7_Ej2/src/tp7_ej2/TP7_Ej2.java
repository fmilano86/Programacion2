/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp7_ej2;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class TP7_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Rectangulo(4.8, 2.1, "Violeta"));
        figuras.add(new Circulo(1, "Rojo"));
        figuras.add(new Rectangulo(4.3, 5.2, "Verde"));
        figuras.add(new Circulo(2, "Naranja"));
        

        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura.area());
        }
    }
    
}
