/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp5_ej12;

/**
 *
 * @author Usuario
 */
public class TP5_Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("Pedro Sánchez", "20-33444555-9");
        Impuesto i = new Impuesto("15000", c);
        Calculadora calc = new Calculadora();

        calc.calcular(i);
    }
    
}
